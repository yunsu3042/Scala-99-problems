package _02Arithmetics

import org.scalatest.{FunSpec, Matchers}

class P31Test extends FunSpec with Matchers {
  it("2 is a prime number") {
    val prime = P31.isPrime(2)
    prime should be(true)
  }

  it("7 is a prime number") {
    val prime = P31.isPrime(7)
    prime should be(true)
  }

  it("10 is not prime number") {
    val prime = P31.isPrime(10)
    prime should be(false)
  }
}

