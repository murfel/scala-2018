package HList

sealed trait HList

object HList {

  case class HCons[+H, +T <: HList](head: H, tail: T) extends HList

  case object HNil extends HList

  implicit class HListExt[R <: HList](private val list: R) extends AnyVal {
    def ::[H](head: H) = HCons(head, list)

    def :::[L <: HList, Result <: HList] (left: L)
    (implicit appendable: Appendable[L, R, Result]): Result =
      appendable(left, list)

    def splitAt[Index <: Integer, Left <: HList, Right <: HList] (index: Index)
    (implicit splittable: Splittable[R, Index, Left, Right]): (Left, Right) =
      splittable(list, index)

    def zip[Right <: HList, Result <: HList]
    (right: Right) (implicit zippable: Zippable[R, Right, Result]): Result =
      zippable(list, right)
  }

  def main(args: Array[String]): Unit = {
    val list = ("hello" :: 42 :: false :: HNil) ::: ("world" :: HNil)

    val hello: String = list.head
    val world: String = list.tail.tail.tail.head
    println(s"$hello $world")
  }
}