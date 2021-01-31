import org.scalatest.flatspec.AnyFlatSpec

class DivideSpec extends AnyFlatSpec {

  "If divided by zero" should "not defined" in {
    val res = Divide.divideIntegers(1, 0)
    assert(res == "not defined")
  }
  "zero divided by any number" should " be zero" in {
    val res = Divide.divideIntegers(0, 1)
    assert(res == 0)
  }
  "divide integers" should "be success" in {
    val res = Divide.divideIntegers(10, 2)
    assert(res == 5)
  }
}
