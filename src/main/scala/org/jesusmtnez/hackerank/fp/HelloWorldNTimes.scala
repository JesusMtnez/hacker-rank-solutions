package org.jesusmtnez.hackerank.fp


/**
  * Print "Hello World" N amount of times. The input portion will be handled automatically.
  * You need to write a function with the recommended method signature.
  */
object HelloWorldNTimes extends App {

  @scala.annotation.tailrec
  def f(n: Int): Unit = {
    println("Hello World")
    if (n > 1) f(n-1)
  }

  val n = scala.io.StdIn.readInt
  f(n)
}