package com.knoldus
import scala.io.StdIn._

/***
 * types Fibonacci series for given number.
 */

object Fibonacci {
  def fibonacci(number: Int): Array[Int] = {
    var array: Array[Int] = new Array[Int](number)
    var temp = 0

    for (i <- 0 to number - 1; if (number >= 0)) {
      if (i < 2) {
        array(i) = 1
        temp = array(i)
      }
      else {
        array(i) = array(i - 1) + temp
        temp = array(i - 1)
      }
    }
    array
  }

  def main(args: Array[String]) {
    print("Enter range for series : ")
    val number = readInt()
    var array = fibonacci(number)
    array.foreach(x => print(x + ", "))
  }
}
