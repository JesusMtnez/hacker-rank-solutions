package org.jesusmtnez.hackerank.fp

/**
  * For a given list with N integers, return a new list removing the elements at odd positions.
  * The input and output portions will be handled automatically. You need to write a function
  * with the recommended method signature.
  */
object FilterPositionsInAList extends App {

  def f(arr:List[Int]):List[Int] = {
    arr
      .zipWithIndex
      .filterNot(_._2 % 2 == 0)
      .map(_._1)
  }

  print(f(List(1,2,3,4)))
}
