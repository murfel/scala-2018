package ru.hse.spb

import org.junit.Assert.{assertEquals, assertFalse, assertTrue}
import org.junit.Test

import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.util.Random

class TreapSetTests {
  private def createSet[A](elements: A*)(implicit ord: Ordering[A]): TreapSet[A] = {
    val set = new TreapSet[A]()
    elements.foreach(x => set.add(x))
    set
  }

  private def setToList(set: TreapSet[Int]): List[Int] = {
    val list = new mutable.MutableList[Int]()
    set.foreach(x => list += x)
    list.toList
  }

  @Test
  def testSizeEmpty(): Unit = {
    val set = new TreapSet[Int]()
    assertEquals(0, set.getSize)
  }

  @Test
  def smokeTestAdd(): Unit = {
    val set = new TreapSet[Int]()
    assertTrue(set.add(1))
  }

  @Test
  def testAddContains(): Unit = {
    val set = new TreapSet[Int]()
    assertFalse(set.contains(1))
    set.add(1)
    assertTrue(set.contains(1))
  }

  @Test
  def testEmptyNotContains(): Unit = {
    val set = new TreapSet[Int]()
    assertFalse(set.contains(0))
  }

  @Test
  def removeFromEmpty(): Unit = {
    val set = new TreapSet[Int]()
    assertFalse(set.remove(0))
  }

  @Test
  def testSizeAfterAdd(): Unit = {
    val set = new TreapSet[Int]()
    set.add(1)
    assertEquals(1, set.getSize)
  }

  @Test
  def testAddContainsRemove(): Unit = {
    val set = new TreapSet[Int]()
    assertTrue(set.add(8))
    assertEquals(1, set.getSize)
    assertTrue(set.contains(8))
    assertFalse(set.add(8))
    assertEquals(1, set.getSize)
    assertTrue(set.add(-3))
    assertEquals(2, set.getSize)
    assertTrue(set.contains(-3))
    assertTrue(set.contains(8))
    assertFalse(set.contains(5))
    assertTrue(set.contains(8))
    assertTrue(set.remove(8))
    assertFalse(set.contains(8))
    assertTrue(set.contains(-3))
  }

  @Test
  def simpleIterator(): Unit = {
    val set = createSet(8, -3, 0, 9)
    val it = set.iterator()
    assertTrue(it.hasNext)
    assertEquals(-3, it.next())
    assertTrue(it.hasNext)
    assertEquals(0, it.next())
    assertTrue(it.hasNext)
    assertEquals(8, it.next())
    assertTrue(it.hasNext)
    assertEquals(9, it.next())
    assertFalse(it.hasNext)
  }

  @Test
  def simpleForeach(): Unit = {
    val set = createSet(8, -3, 0, 9)
    val expected = List(-3, 0, 8, 9)
    val actual = new mutable.MutableList[Int]()
    set.foreach(x => actual += x)
    assertTrue(expected == actual.toList)
  }

  @Test
  def simpleFold(): Unit = {
    val set = createSet(1, 2, 4, 8)
    assertEquals(15, set.fold(0)((x: Int, y: Int) => x + y))
  }

  @Test
  def simpleMap(): Unit = {
    val set = createSet(1, 2, 4, 8)
    val list = List(8, -3, 0, 9)
    val listIterator = list.iterator
    val mappedSet = set.map(x => listIterator.next())
    val expected = List(-3, 0, 8, 9)
    assertTrue(expected == setToList(mappedSet))
  }

  @Test
  def simpleFlatMap(): Unit = {
    val set = createSet(1, 3, 5)
    val actualSet = set.flatMap(x => createSet(x, x + 1))
    val actual = setToList(actualSet)
    val expected = List(1, 2, 3, 4, 5, 6)
    assertEquals(expected, actual)
  }
}









































