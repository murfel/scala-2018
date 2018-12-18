package HList

trait Zippable[Left <: HList, Right <: HList, Result <: HList] {
  def apply(left: Left, right: Right): Result
}

object Zippable {

}