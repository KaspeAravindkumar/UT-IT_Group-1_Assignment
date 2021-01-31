package com.knoldus.validator

import com.knoldus.db.CompanyReadto
import com.knoldus.models.Company
import org.scalatest.flatspec.AnyFlatSpec

class CompanyValidatorSpec extends AnyFlatSpec {
  val companyRead = new CompanyReadto
  val emailValidat = new EmailValidator
  val companyValid = new CompanyValidator(companyRead, emailValidat)

  //testcase-1

  "for valid Company parameters" should "be success" in {
    val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
    val res = companyValid.companyIsValid(knoldusCompany)
    assert(res == true)
  }

  //testcase-2

  "for invalid Company parameters" should "be failed" in {
    val knoldusCompany: Company = Company("Knoldus", "emailaddress", "Noida")
    val res = companyValid.companyIsValid(knoldusCompany)
    assert(res == false)
  }

  //testcase-3


  "for invalid Company name" should "be failed" in {
    val knoldusCompany: Company = Company("TCS", "tcs@gmail.com", "Noida")
    val res = companyValid.companyIsValid(knoldusCompany)
    assert(res == false)
  }

}