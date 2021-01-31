package com.knoldus.db

import org.scalatest.flatspec.AnyFlatSpec

class EmployeeReadtoSpec extends AnyFlatSpec {
  val employee = new EmployeeReadto

  //testcase-1

  "for invalid employee name" should "be failed" in {
    val res = employee.getEmployeeByName("name")
    assert(res.isEmpty)
  }

  //testcase-2


  "for employee name" should "be success" in {
    val res = employee.getEmployeeByName("kaspe")
    assert(!res.isEmpty)
  }

  //testcase-3


  "for incorrect employee name" should "be failed" in {
    val res = employee.getEmployeeByName("kspe")
    assert(res.isEmpty)
  }
}