package org.jesusmtnez.hackerank.fp

import scala.io.StdIn

/**
  * Scan two numbers, A and B from STDIN, and print the sum A+B on STDOUT.
  */
object SolveMeFirstFP {
  def main(args: Array[String]) {
    println(io.Source.stdin.getLines().take(2).map(_.toInt).sum)
  }
}
