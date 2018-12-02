package ru.hse.spb

import java.util.NoSuchElementException

import scala.util.Random

class TreapSet[A](implicit comparator: Ordering[A], val seed: Long = 1337) {
  private val random = new Random(seed)
  private var root: Node = _
  private var size: Int = 0


  private class Node(val key: A, val priority: Int = random.nextInt()) {
    private var _left: Node = _
    private var _right: Node = _
    private var _parent: Node = _

    def left: Node = _left

    def right: Node = _right

    def parent: Node = _parent

    def setLeft(left: Node): Node = {
      this._left = left
      if (left == null) {
        return this
      }
      left._parent = this
      this
    }

    def setRight(right: Node): Node = {
      this._right = right
      if (right == null) {
        return this
      }
      right._parent = this
      this
    }
  }

  private class SplitTrees(val left: Node, val right: Node)

  /* Split a BST on a key into two BST s.t. the keys in the first tree are less than or equal the key
   * and the rest of the keys are in the right tree.
   *
   * After the call, root might be in an incorrect state and should never be used.
   */
  private def split(root: Node = root, key: A): SplitTrees = {
    if (root == null) {
      return new SplitTrees(null, null)
    }
    if (comparator.compare(key, root.key) < 0) {
      val splitTrees = split(root.left, key)
      root.setLeft(splitTrees.right)
      new SplitTrees(splitTrees.left, root)
    } else {
      val splitTrees = split(root.right, key)
      root.setRight(splitTrees.left)
      new SplitTrees(root, splitTrees.right)
    }
  }

  private def merge(left: Node, right: Node): Node = {
    if (left == null || right == null) {
      if (left == null) right else left
    } else if (left.priority < right.priority) {
      left.setRight(merge(left.right, right))
    } else {
      right.setLeft(merge(left, right.left))
    }
  }

  def add(elem: A): Boolean = {
    if (contains(elem)) {
      false
    } else {
      root = add(root, new Node(elem))
      size += 1
      true
    }
  }

  private def add(root: Node, node: Node): Node = {
    if (root == null) {
      node
    } else if (node.priority > root.priority) {
      val splitTrees = split(root, node.key)
      node.setLeft(splitTrees.left)
      node.setRight(splitTrees.right)
    } else {
      if (comparator.compare(node.key, root.key) < 0) {
        root.setLeft(add(root.left, node))
      } else {
        root.setRight(add(root.right, node))
      }
    }
  }

  private def contains(root: Node, elem: A): Boolean = {
    if (root == null) {
      return false
    }
    val comparison = comparator.compare(elem, root.key)
    if (comparison == 0) {
      true
    } else {
      contains(if (comparison < 0) root.left else root.right, elem)
    }
  }

  def contains(elem: A): Boolean = contains(root, elem)


  def remove(elem: A): Boolean = {
    if (!contains(elem)) {
      return false
    }
    val splitTrees = split(root, elem)
    // splitTrees.left != null because there's at least a node with the key = elem.
    // The rightmost node in splitTrees.left is the node with the key = elem.
    if (splitTrees.left.key == elem) {
      root = merge(splitTrees.left.left, splitTrees.right)
    } else {
      var parent = splitTrees.left
      while (parent.right.right != null) {
        parent = parent.right
      }
      parent.setRight(null)
      root = merge(splitTrees.left, splitTrees.right)
    }
    size -= 1
    true
  }

  def getSize: Int = size

  private class TreapIterator() extends Iterator[A] {
    private var nextNode = findLeftestNode(root)

    override def hasNext: Boolean = nextNode != null

    private def findLeftestNode(node: Node): Node = {
      var leftest = node
      while (leftest.left != null) {
        leftest = leftest.left
      }
      leftest
    }

    private def findLeftParent(node: Node): Node = {
      if (node.parent == null) {
        return null
      }
      var curNode = node
      while (curNode.parent != null) {
        if (curNode.parent.left == curNode) {
          return curNode.parent
        }
        curNode = curNode.parent
      }
      null
    }

    override def next(): A = {
      if (!hasNext) {
        throw new NoSuchElementException
      }
      val nextElement = nextNode.key
      if (nextNode.right != null) {
        nextNode = findLeftestNode(nextNode.right)
      } else {
        nextNode = findLeftParent(nextNode)
      }
      nextElement
    }
  }

  def iterator(): Iterator[A] = new TreapIterator()

  def foreach(f: A => Unit): Unit = {
    val it = iterator()
    while (it.hasNext) {
      f(it.next())
    }
  }

  def fold[B](z: B)(op: (B, A) => B): B = {
    var result = z
    val it = iterator()
    while (it.hasNext) {
      result = op(result, it.next())
    }
    result
  }

  def map[B: Manifest](op: A => B)(implicit ord: Ordering[B]): TreapSet[B] = {
    val newSet = new TreapSet[B]()
    foreach(x => newSet.add(op(x)))
    newSet
  }

  def flatMap[B: Manifest](op: A => TreapSet[B])(implicit ord: Ordering[B]): TreapSet[B] = {
    val newSet = new TreapSet[B]()
    val it = iterator()
    while (it.hasNext) {
      val set = op(it.next())
      set.foreach(x => newSet.add(x))
    }
    newSet
  }

  private def printTree(node: Node): Unit = {
    if (node == null) {
      return
    }
    println(node.key)
    printTree(node.left)
    printTree(node.right)
  }

  /* For debugging.
   */
  private def printTree(): Unit = printTree(root)
}
