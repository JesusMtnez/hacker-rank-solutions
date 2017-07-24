package org.jesusmtnez.hackerank.fp


/**
  * You are given a list. Return the sum of odd elements from the given list. The input and
  * output portions will be handled automatically. You need to write a function with the
  * recommended method signature.
  */
object SumOfOddElements extends App {
  def f(arr:List[Int]):Int = {
    arr
      .filterNot(_ % 2 == 0)
      .sum
  }

  printf(f(List(3,2,4,6,5,7,8,0,1)).toString)
}
