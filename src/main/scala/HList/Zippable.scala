package HList

trait Zippable[Left <: HList, Right <: HList, Result <: HList] {
  def apply(left: Left, right: Right): Result
}

object Zippable {
//  import HList.{HCons, HNil}

  import HList._

  implicit def zippableLeftAndRightAreNil[Right <: HList]: Zippable[HNil.type, HNil.type, HNil.type] =
    (_: HNil.type, _: HNil.type ) => HNil

  implicit def zippableLeftIsNil[Right <: HList]: Zippable[HNil.type, Right, HNil.type] =
    (_: HNil.type, _: Right) => HNil

  implicit def zippableRightIsNil[Left <: HList]: Zippable[Left, HNil.type, HNil.type] =
    (_: Left, _: HNil.type) => HNil

  implicit def zippable[LeftHead, Left <: HList, RightHead, Right <: HList, Result <: HList]
  (implicit zippable: Zippable[Left, Right, Result]):
  Zippable[HCons[LeftHead, Left], HCons[RightHead, Right], HCons[(LeftHead, RightHead), Result]] =
    (left: HCons[LeftHead, Left], right: HCons[RightHead, Right]) =>
      HCons((left.head, right.head), zippable(left.tail, right.tail))
}