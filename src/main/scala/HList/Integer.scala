package HList

sealed trait Integer

object Integer {
  sealed trait NonNegative <: Integer
  sealed trait NonPositive <: Integer

  case object O extends NonNegative with NonPositive
  case class S[nonNegative <: NonNegative](predecessor: NonNegative)
    extends NonNegative
  
  val _0: O.type = O
  val _1 = S(_0)
  val _2 = S(_1)
}
