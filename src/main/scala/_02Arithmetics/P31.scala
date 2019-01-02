package _02Arithmetics
import java.util.NoSuchElementException

object P31 {
  def isPrime[A](n : Int) : Boolean = {
    if (n <= 1) false
    else if (n == 2) true
    else aux(n, 2)
  }

  def aux[A](n : Int, i : Int) : Boolean =
    if(n % i != 0)
      if (i < n / 2) aux(n, i + 1)
      else true
    else false
}
