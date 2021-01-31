import scala.io.StdIn._

/***
 * Divides two Integers values
 */

object Divide {

  def main(args: Array[String]) {
    print("Enter the first number : ")
    val firstnumber = readInt()
    print("Enter the second number : ")
    val secondnumber = readInt()
    println("The answer is : " + divideIntegers(firstnumber, secondnumber))
  }

  def divideIntegers(firstnumber: Int, secondnumber: Int) = {
    try {
      firstnumber / secondnumber
    }
    catch {
      case i: Exception =>
        println(i.getMessage)
        "not defined"
    }
  }
}