package _02Arithmetics
import java.util.NoSuchElementException

object P34 {
  def primeNumbers(r : Range) : List[Int] = {
    def aux (r : List[Int], ret : List[Int]) : List[Int] = {
      r match {
        case hd :: tl =>
          if(P31.isPrime(hd)) aux(tl, hd :: ret)
          else aux(tl, ret)
        case Nil =>
          ret.reverse
      }
    }
    aux(r.toList, Nil)
  }
}
