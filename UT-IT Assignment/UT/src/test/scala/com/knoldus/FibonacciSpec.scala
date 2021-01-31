package com.knoldus
import org.scalatest.flatspec.AnyFlatSpec

class FibonacciSpec extends AnyFlatSpec {

  "If the series is correct" should "be success" in {
    val result: Array[Int] = Array(1, 1, 2, 3, 5)
    val res = Fibonacci.fibonacci(5)
    assert(result.sameElements(res))
  }

  "For -ve range number" should "be failed" in {
    val caught =
      intercept[NegativeArraySizeException] {
        Fibonacci.fibonacci(-1)
      }
    assert(caught.getMessage.indexOf("-1") != -1)
  }
}