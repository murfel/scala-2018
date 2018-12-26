package HList

sealed trait HList

object HList {
  case class HCons[+H, +T <: HList](head: H, tail: T) extends HList

  case object HNil extends HList

  implicit class HListExt[List <: HList](private val list: List) extends AnyVal {
    def ::[H](head: H) = HCons(head, list)

    def :::[Left <: HList, Result <: HList] (left: Left)
    (implicit appendable: Appendable[Left, List, Result]): Result =
      appendable.apply(left, list)

    def splitAt[Index <: Number, Left <: HList, Right <: HList](index: Index)
    (implicit splittable: Splittable[List, Index, Left, Right]): (Left, Right) =
      splittable(list, index)

    def zip[Right <: HList, Result <: HList]
    (right: Right) (implicit zippable: Zippable[List, Right, Result]): Result =
      zippable(list, right)
  }

  def main(args: Array[String]): Unit = {
    val list = ("hello" :: 42 :: false :: HNil) ::: ("world" :: HNil)
//    val list2 = "there" :: 24 :: HNil
//    val zipped = list zip list2
//    println(s"${zipped.head._1} ${zipped.head._2}")
//    println(s"${zipped.tail.head._1} ${zipped.tail.head._2}")
  }
}