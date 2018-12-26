package _01Lists

import org.scalatest.{FunSpec, Matchers}

class P03Test extends FunSpec with Matchers {
  it("should be first element when k is 0"){
    P03.kth(List(1, 2, 3, 4, 5), 0) should be (1)
  }

  it("should be last element when k is equal to size of list minus one") {
    P03.kth(List(1, 2, 3, 4, 5), 4) should be(5)
  }

  it("should be (k+1)th element") {
    P03.kth(List(1, 2, 3, 4, 5), 2) should be(3)
  }
}
