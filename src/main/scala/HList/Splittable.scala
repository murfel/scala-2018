package HList

trait Splittable[List <: HList, Index <: Integer, Left <: HList, Right <: HList] {
  def apply(list: List, index: Index): (Left, Right)
  // 0 1 2 ::: 3 4
}

object Splittable {
  import HList.{HCons, HNil}
//  import HList.Integer.S

  implicit def zeroSplittable[List <: HList]:
  Splittable[List, Integer.O.type, HList.HNil.type, List] =
    (list: List, _: Integer.O.type) => (HNil, list)

  // split 0:1:2:3 at 3 = split 1:2:3 at 2, left = 0:left, right=right
  implicit def splittable[???]:
  Splittable[???] =
    (list: HCons[H, L], index: Integer) => {

//      val nl = splittable(list, )
    }
}

