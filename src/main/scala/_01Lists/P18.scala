package _01Lists

import java.util.NoSuchElementException
object P18 {
  def slice[A](ls: List[A], begin : Int, end : Int) : List[A] =
    aux(ls, begin, end, Nil)

  def aux[A](ls: List[A], begin : Int, end : Int, ret : List[A]) : List[A] =
    ls match {
      case hd :: tl =>
        if(begin == 1 && end != 1) aux(tl, begin, end - 1, hd :: ret)
        else if (begin > 1 && end >= begin) aux(tl, begin - 1, end - 1, ret)
        else if (end == 1) (hd :: ret).reverse
        else throw new NoSuchElementException("Wrong index")
      case Nil => ret.reverse
    }

}