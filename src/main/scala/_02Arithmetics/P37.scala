package _02Arithmetics
import java.util.NoSuchElementException

object P37 {
  def gcd(a : Int, b : Int) : Int = {
    def aux(a : Int, b : Int, min : Int, i : Int, ret : Int) : Int = {
      if (i <= min)
        if (a % i == 0 && b % i == 0) aux(a, b, min, i + 1, i)
        else aux(a, b, min, i + 1, ret)
      else ret
    }
    val min = if(a < b) a else b
    aux(a, b, min, 1, 1)
  }
}
