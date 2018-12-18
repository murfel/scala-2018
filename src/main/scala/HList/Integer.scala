package HList

sealed trait Integer

object Integer {
  sealed trait NonPositive <: Integer
  sealed trait NonNegative <: Integer

  case object O extends NonPositive with NonNegative
  case class S[nonNegative <: NonNegative](predecessor: NonNegative) extends NonNegative
  case class P[nonPositive <: NonPositive](successor: NonPositive) extends NonPositive

  val _0: O.type = O

  val _1 = S(_0)
  val _2 = S(_1)

  val m1 = P(_0)
  val m2 = P(m1)
}
