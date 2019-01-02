package _02Arithmetics

import org.scalatest.{FunSpec, Matchers}

class P37Test extends FunSpec with Matchers {
  it("greatest common divisior of 1 and 10 is 1") {
    val result = P37.gcd(1, 10)
    result should be(1)
  }

  it("greatest common divisior of 36 and 63 is 9") {
    val result = P37.gcd(36, 63)
    result should be(9)
  }

}

