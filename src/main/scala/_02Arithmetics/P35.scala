package _02Arithmetics
import java.util.NoSuchElementException

object P35 {
  def goldbach(n: Int): List[Int] = {
    val prime_list = P34.primeNumbers(2 to n)
    val (f, s) = prime_list.splitAt(prime_list.length / 2)
    aux(f, s.reverse, n)
  }

  def aux(f: List[Int], s : List[Int], goal : Int): List[Int] = {
    f match {
      case n :: tl =>
        matcher(s, goal, n) match {
          case Some(v) => List(n, v)
          case None => aux(tl, s, goal)
        }
      case Nil => throw new NoSuchElementException()
    }
  }

  def matcher(ls : List[Int], goal : Int, base : Int) : Option[Int] = {
    ls match {
      case n :: smaller =>
        if (base + n == goal) Some(n)
        else if(base + n < goal) None
        else matcher(smaller, goal, base)
      case Nil => None
    }
  }
}
