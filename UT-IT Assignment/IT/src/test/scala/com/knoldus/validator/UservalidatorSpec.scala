package com.knoldus.validator

import com.knoldus.db.{CompanyReadto, UserReadTo}
import com.knoldus.models.User
import org.scalatest.flatspec.AnyFlatSpec

class UservalidatorSpec extends AnyFlatSpec {
  val companyRead = new CompanyReadto
  val userRead = new UserReadTo
  val emailValidat = new EmailValidator
  val userValid = new UserValidator(userRead, emailValidat, companyRead)

  //testcase-1

  "for valid User detais" should "be success" in {
    val user1: User = User("user1", "kumar", 21, "kaspe.kumar@knoldus.com", "9123456789", "city", "Knoldus")
    val res = userValid.userValidator(user1)
    assert(res == true)
  }

  //testcase-2

  "for invalid user details" should "be failed" in {
    val user1: User = User("user1", "kumar", 21, "email", "9123456789", "city", "Knoldus")
    val res = userValid.userValidator(user1)
    assert(res == false)
  }

  //testcase-3


  "for invalid user name" should "be failed" in {
    val user1: User = User("user10", "kumar", 21, "email", "9123456789", "city", "knoldus")
    val res = userValid.userValidator(user1)
    assert(res == false)
  }
}
