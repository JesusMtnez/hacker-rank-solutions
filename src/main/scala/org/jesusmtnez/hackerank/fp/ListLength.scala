package org.jesusmtnez.hackerank.fp


/**
  * Count the number of elements in an array without using count, size or length operators (or their equivalents).
  * The input and output portions will be handled automatically by the grader. You only need to write a function
  * with the recommended method signature.
  */
object ListLength extends App {
  def f(arr:List[Int]):Int =
    arr.foldLeft(0)((acc, _) => acc + 1)

  println(f(List(2,5,1,4,3,7,8,6,0,9)))
}
