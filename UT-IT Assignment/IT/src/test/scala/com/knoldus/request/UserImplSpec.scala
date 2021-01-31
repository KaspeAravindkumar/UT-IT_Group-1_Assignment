package com.knoldus.request

import com.knoldus.db.{CompanyReadto, EmployeeReadto, UserReadTo}
import com.knoldus.models.{Employee, User}
import com.knoldus.validator.{EmailValidator, EmployeeValidator, UserValidator}
import org.scalatest.flatspec.AnyFlatSpec

class UserImplSpec extends AnyFlatSpec {
  val companyRead = new CompanyReadto
  val userRead = new UserReadTo
  val emailValidat = new EmailValidator
  val userValid = new UserValidator(userRead, emailValidat, companyRead)
  val userImp = new UserImpl(userValid)

  //testcase-1

  "for valid User parameters " should "be success" in {
    val user1: User = User("user1", "lastName", 21, "kaspe.kumar@knoldus.com", "9123456789", "city", "Knoldus")
    val res = userImp.createUser(user1)
    assert(!res.isEmpty)
  }

  //testcase-2

  "for invalid user parameters" should "be failed" in {
    val user1: User = User("user1", "lastName", 21, "emailaddress", "9123456789", "city", "Knoldus")
    val res = userImp.createUser(user1)
    assert(res.isEmpty)
  }

  //testcase-3


  "for invalid user name" should "be failed" in {
    val user1: User = User("user10", "lastName", 21, "kaspe1999@knoldus.com", "9123456789", "city", "Knoldus")
    val res = userImp.createUser(user1)
    assert(res.isEmpty)
  }
}
