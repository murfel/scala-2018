package ru.hse.spb

trait Iterator[A] {
  def hasNext: Boolean
  def next(): A
}
