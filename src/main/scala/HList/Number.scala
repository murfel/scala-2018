package HList

sealed trait Number

object Number {
  case object Zero extends Number
  case class Successor[Predecessor <: Number](predecessor: Predecessor) extends Number

  val _0: Zero.type = Zero
  val _1 = Successor(_0)
  val _2 = Successor(_1)
  val _3 = Successor(_2)
  val _4 = Successor(_3)
  val _5 = Successor(_4)
  val _6 = Successor(_5)
}

