package _01Lists

import java.util.NoSuchElementException


object P11 {

  /*
  auxiliary function
   */
  def run_length[A](ls : List[A], cnt : Int, ret : List[Any]) : List[Any] =
    ls match {
      case cur :: next :: tl =>
        if(cur == next) run_length(next :: tl, cnt + 1, ret)
        else run_length(next :: tl, 0, (cnt + 1, cur) :: ret)
      case last :: Nil => run_length(Nil, 0, (cnt + 1, last) :: ret)
      case Nil =>ret.reverse
    }

  def single_check[A](ls: List[Any], ret : List[A]) : List[Any] =
    ls match {
      case (1, char) :: tl => single_check(tl, char :: ret)
      case hd :: tl => single_check(tl, hd :: ret)
      case Nil => ret.reverse
    }

  def encode_modified[A](ls : List[A]) : List[Any] ={
    val encoded = run_length[A](ls, 0, Nil)
    single_check[A](encoded, Nil)
  }


}