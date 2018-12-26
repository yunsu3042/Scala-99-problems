package _01Lists

import java.util.NoSuchElementException

object P09 {

  /*
    actual function with tail-recursive. grp and ret are maintained.
  */
  def go[A](ls : List[A], grp : List[A], ret : List[List[A]]) : List[List[A]] = {
    ls match {
      case prev :: cur :: tl  =>
        if (prev == cur) go(cur :: tl, prev :: grp, ret)
        else go(cur :: tl, Nil, (prev :: grp) :: ret)
      case last :: Nil =>
        grp match {
          case Nil => go(Nil, Nil, (last :: Nil) :: ret)
          case _ => go(Nil, Nil, (last :: grp) :: ret)
        }
      case Nil => ret.reverse
    }
  }

  def pack[A](ls : List[A]) : List[List[A]] = {
    go[A](ls, Nil, Nil)
  }
}