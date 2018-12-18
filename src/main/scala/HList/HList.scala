package HList

sealed trait HList

object HList {

  case class HCons[+H, +T <: HList](head: H, tail: T) extends HList

  case object HNil extends HList

  implicit class HListExt[R <: HList](private val list: R) extends AnyVal {

    def ::[H](head: H) = HCons(head, list)

    def :::[L <: HList, Result <: HList]
    (left: L)(implicit appendable: Appendable[L, R, Result]): Result =
      appendable(left, list)

    // 0 1 2 3 4
    def splitAt[Index <: Integer, Left <: HList, Right <: HList]
    (index: Index): (Left, Right) = ???

  }

  def main(args: Array[String]): Unit = {
    val list = ("hello" :: 42 :: false :: HNil) ::: ("world" :: HNil)

    val hello: String = list.head
    val world: String = list.tail.tail.tail.head
    println(s"$hello $world")

    // val l1
    // val l2
    // val l = zip(l1, l2)
    // l[]

  }
}