package com.knoldus.validator

import com.knoldus.db.EmployeeReadto
import com.knoldus.models.Employee
import com.knoldus.request.EmployeeImpl
import org.scalatest.flatspec.AnyFlatSpec

class EmployeeValidatorSpec extends AnyFlatSpec {

  val employeeRead = new EmployeeReadto
  val emailValidat = new EmailValidator
  val employeeValid = new EmployeeValidator(employeeRead, emailValidat)
  val employeeImp = new EmployeeImpl(employeeValid)

  //testcase-1

  "for valid Employee parameters" should "be success" in {
    val employee1 = Employee("kaspe", "kumar", 21, 15000, "Intern", "Knoldus", "kaspe.kumar@knoldus.com")
    val res = employeeValid.employeeIsValid(employee1)
    assert(res == true)
  }

  //testcase-2

  "for invalid Employee parameters" should "be failed" in {
    val employee1 = Employee("kaspe", "kumar", 21, 15000, "Intern", "knoldus", "kaspe1999@knoldus.test")
    val res = employeeValid.employeeIsValid(employee1)
    assert(res == false)
  }

}