package org.jesusmtnez.hackerank.fp


/**
  * Given a list, repeat each element in the list  amount of times. The input and output portions will
  * be handled automatically by the grader. You need to write a function with the recommended method signature.
  */
object ListReplication extends App {

  def f(num:Int, arr:List[Int]): List[Int] = {

    @scala.annotation.tailrec
    def fAux(times: Int, pendingList: List[Int], result: List[Int]): List[Int] =
      pendingList match {
        case head :: tail =>
          fAux(times, tail, result ::: List.fill(times)(head))
        case Nil =>
          result
      }

    fAux(num, arr, List.empty[Int])

  }
}
