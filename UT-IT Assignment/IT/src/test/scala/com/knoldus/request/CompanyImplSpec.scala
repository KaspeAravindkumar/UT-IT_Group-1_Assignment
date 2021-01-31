package com.knoldus.request

import com.knoldus.db.CompanyReadto
import com.knoldus.models.Company
import com.knoldus.validator.{CompanyValidator, EmailValidator}
import org.scalatest.flatspec.AnyFlatSpec

class CompanyImplSpec extends AnyFlatSpec {
  val companyRead = new CompanyReadto
  val emailValidat = new EmailValidator
  val companyValid = new CompanyValidator(companyRead, emailValidat)
  val companyImp = new CompanyImpl(companyValid)

  //testcase-1

  "for valid company parameters" should "be success" in {
    val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
    val res = companyImp.createCompany(knoldusCompany)
    assert(!res.isEmpty)
  }

  //testcase-2

  "for invalid company parameters" should "be failed" in {
    val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.test", "Noida")
    val res = companyImp.createCompany(knoldusCompany)
    assert(res.isEmpty)
  }

  //testcase-3


  "for invalid company name" should "be failed" in {
    val knoldusCompany: Company = Company("name", "email@gmail.com", "Noida")
    val res = companyImp.createCompany(knoldusCompany)
    assert(res.isEmpty)
  }
}