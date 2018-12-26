package _01Lists

import java.util.NoSuchElementException

object P03 {
  /*
    Using recursion style.
  */
  def kth[A](ls : List[A], k : Int) : A = {
    ls match {
      case hd :: tl => if(k == 0) hd else kth(tl, k - 1)
      case Nil => throw new NoSuchElementException()
    }
  }
}