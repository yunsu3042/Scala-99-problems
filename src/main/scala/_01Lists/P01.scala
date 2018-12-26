package _01Lists

import java.util.NoSuchElementException

object P01 {
  /*
    Using recursion style.
  */
  def last[A](ls : List[A]) : A = {
    ls match {
      case hd :: Nil => hd
      case _ :: tl => last(tl)
      case Nil => throw new NoSuchElementException("empty list")
    }
  }
}