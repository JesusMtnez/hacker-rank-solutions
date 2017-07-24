package org.jesusmtnez.hackerank.fp


/**
  * Filter a given array of integers and output only those values that are less than a specified value X.
  * The output integers should be in the same sequence as they were in the input. You need to write a
  * function with the recommended method signature for the languages mentioned below. For the rest of the
  * languages, you have to write a complete code.
  */
object FilterArray extends App {
  def f(delim: Int, arr: List[Int]): List[Int] =
    arr.filter(_ < delim)
}
