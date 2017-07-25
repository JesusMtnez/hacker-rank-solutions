package org.jesusmtnez.hackerank.fp


/**
  * Evaluate e^x for given values of x by using the expansion for the first 10 terms.
  */
object EvaluatingEx {

  def factorial(number: Int) : Int = {
    @scala.annotation.tailrec
    def factorialAux(accumulator: Int, number: Int): Int = {
      if (number == 1) return accumulator
      factorialAux(number * accumulator, number - 1)
    }
    factorialAux(1, number)
  }

  def exponentialFunctionAux(x: Double, pos: Int): Double = {
    pos match {
      case 0 => 1.0
      case 1 => x
      case _ => math.pow(x, pos) / factorial(pos)
    }
  }

  def exponentialFunction(x: Double): Double = {
    (0 to 9).foldLeft(0.0)((acc, elem) => acc + exponentialFunctionAux(x, elem))
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    var n = sc.nextInt()
    var a0: Int = 0
    while(a0 < n){
      var x = sc.nextDouble()
      println(BigDecimal(exponentialFunction(x)).setScale(4, BigDecimal.RoundingMode.FLOOR))
      a0+=1
    }
  }
}
