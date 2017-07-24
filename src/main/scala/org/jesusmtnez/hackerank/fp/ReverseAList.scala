package org.jesusmtnez.hackerank.fp


/**
  * You are given a list of N elements. Reverse the list without using the reverse function.
  * The input and output portions will be handled automatically. You need to write a function
  * with the recommended method signature.
  */
object ReverseAList extends App {
  def f(arr:List[Int]):List[Int] =
    arr.foldLeft(List.empty[Int])((acc, e) => e :: acc)

  println(f(List(1,2,3,4)))
}
