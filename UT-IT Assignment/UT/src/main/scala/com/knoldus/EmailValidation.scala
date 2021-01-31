package com.knoldus

import scala.util.matching.Regex

/***
 * checks for valid email Ids
 */

object EmailValidation {

  def validEmail(email: String): Boolean = {
    val pattern = new Regex("^([a-zA-Z\\d\\.-]+)@([a-zA-Z\\d-]+)\\.(com|net|org)$")
    val x = (pattern.findAllIn(email)).mkString("")
    if (x == email)
      true
    else {
      false
    }
  }
}