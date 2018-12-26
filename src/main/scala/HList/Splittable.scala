package HList

trait Splittable[List <: HList, Index <: Number, Left <: HList, Right <: HList] {
  def apply(list: List, index: Index): (Left, Right)
  // 0 1 2 ::: 3 4
}

object Splittable {
  import HList.{HNil, HCons}

  implicit def zeroSplittable[List <: HList]:
  Splittable[List, Number.O.type, HList.HNil.type, List] =
    (list: List, _: Number.O.type) => (HNil, list)

  // split 0:1:2:3 at 3 = split 1:2:3 at 2, left = 0:left, right=right
  implicit def splittable
  [Head, Tail <: HList, Index <: Number.NonNegative, Left <: HList, Right <: HList]
  (implicit splittable: Splittable[Tail, Index, Left, Right]):
  Splittable[HCons[Head, Tail], Number.Successor[Index], HCons[Head, Left], Right] =
    (list: HCons[Head, Tail], index: Number.Successor[Index]) => {
      val (left, right) = splittable(list.tail, index.predecessor)
      (list.head :: left, right)
    }
}

