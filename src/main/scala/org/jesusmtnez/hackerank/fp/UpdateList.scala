package org.jesusmtnez.hackerank.fp


/**
  * Update the values of a list with their absolute values. The input and output portions will be handled
  * automatically during grading. You only need to write a function with the recommended method signature.
  */
object UpdateList extends App {
  def f(arr:List[Int]): List[Int] =
    arr.map(scala.math.abs)

  println(f(List(2,-4,3,-1,23,-4,-54)))
}
