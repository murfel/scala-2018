package HList

trait Splittable[List <: HList, Index <: Integer, Left <: HList, Right <: HList] {
  def apply(list: List, index: Index): (Left, Right)
  // 0 1 2 ::: 3 4
}

object Splittable {
  import HList.{HCons, HNil}

  implicit def zeroSplittable[List <: HList]:
  Splittable[List, Integer.O.type, HList.HNil.type, List] =
    (list: List, _: Integer.O.type) => (HNil, list)

  // split 0:1:2:3 at 3 = split 1:2:3 at 2, left = 0:left, right=right
  implicit def splittable
  [Head, Tail <: HList, Index <: Integer.NonNegative, Left <: HList, Right <: HList]
  (implicit splittable: Splittable[Tail, Index, Left, Right]):
  Splittable[HCons[Head, Tail], Integer.S[Index], HCons[Head, Left], Right] =
    (list: HCons[Head, Tail], index: Integer.S[Index]) => {
      val (left, right) = splittable(list.tail, index.predecessor)
      (list.head :: left, right)
    }
}

