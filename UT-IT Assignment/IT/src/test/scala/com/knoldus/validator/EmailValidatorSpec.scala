package com.knoldus.validator

import org.scalatest.flatspec.AnyFlatSpec

class EmailValidatorSpec extends AnyFlatSpec {

  //testcase-1

  "for valid email" should "be success" in {
    val email = (new EmailValidator).emailIdIsValid("kaspe1999@gmail.com")
    assert(email == true)
  }

  //testcase-2

  "for valid username with alphanumeric" should "be success" in {
    val email = (new EmailValidator).emailIdIsValid("Kaspe1999@knoldus.com")
    assert(email == true)
  }

  //testcase-3

  "If @ symbol is absent" should "be failed" in {
    val email = (new EmailValidator).emailIdIsValid("kaspe.kumar knoldus.com")
    assert(email == false)
  }

  //testcase-4

  "for invalid email domain" should "be failed" in {
    val email = (new EmailValidator).emailIdIsValid("Kaspe1999@gmail.test")
    assert(email == false)
  }

}