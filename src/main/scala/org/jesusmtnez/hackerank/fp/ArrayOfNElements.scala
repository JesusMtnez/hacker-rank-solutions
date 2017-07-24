package org.jesusmtnez.hackerank.fp


/**
  * Create an array of n integers, where the value of  is passed as an argument to the pre-filled function
  * in your editor. This challenge uses a custom checker, so you can create any array of n integers.
  */
object ArrayOfNElements extends App {
  def f(num:Int) : List[Int] = {
    List.fill(num)(0)
  }

  println(f(5))
}
