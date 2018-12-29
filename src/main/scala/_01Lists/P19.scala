package _01Lists
import java.util.NoSuchElementException

object P19 {
  def rotate[A](ls : List[A], n : Int) : List[A] =
    ls match {
      case hd :: tl =>
        n match {
          case 0 => ls
          case k if k > 0 => rotate(tl ++ (hd:: Nil), k - 1)
          case k if k < 0 =>
            val front = ls.take(ls.length - 1)
            rotate(ls.last :: front, k + 1)
        }
      case Nil => Nil
    }

}