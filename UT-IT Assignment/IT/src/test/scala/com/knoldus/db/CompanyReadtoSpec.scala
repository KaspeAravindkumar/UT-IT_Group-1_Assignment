package com.knoldus.db

import org.scalatest.flatspec.AnyFlatSpec

class CompanyReadtoSpec extends AnyFlatSpec {

  val company = new CompanyReadto()

  //testcase-1

  "for valid company name " should "be success" in {
    val res = company.getCompanyByName("Knoldus")
    assert(!res.isEmpty)
  }

  //testcase-2

  "for invalid company name" should "be failed" in {
    val res = company.getCompanyByName("name")
    assert(res.isEmpty)
  }

  //testcase-3

  "If numbers are entered in place of company name" should "be failed" in {
    val res = company.getCompanyByName("123")
    assert(res.isEmpty)
  }

}