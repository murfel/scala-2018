package HList

sealed trait Number

object Number {
  sealed trait NonNegative extends Number

  case object O extends NonNegative
  case class Successor[Predecessor <: NonNegative](predecessor: Predecessor)
    extends NonNegative

  val _0: O.type = O
  val _1 = Successor(_0)
  val _2 = Successor(_1)
  val _3 = Successor(_2)
  val _4 = Successor(_3)
  val _5 = Successor(_4)
  val _6 = Successor(_5)
}

