package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class EmailValidationSpec extends AnyFlatSpec {

  "for correct username and email domain" should "be success" in {
    val res: Boolean = EmailValidation.validEmail("kaspe.kumar@knoldus.com")
    assert(res == true)
  }
  "for username with alphanumeric(lower and upper)" should "be success" in {
    val res: Boolean = EmailValidation.validEmail("Kaspe1999@knoldus.com")
    assert(res == true)
  }
  "If @ symbol is absent" should "be failed" in {
    val res: Boolean = EmailValidation.validEmail("kaspe.kumar knoldus.com")
    assert(res == false)
  }

  "for invalid email domain" should "be failed" in {
    val res: Boolean = EmailValidation.validEmail("Kaspe.kumar@knoldus.test")
    assert(res == false)
  }
}