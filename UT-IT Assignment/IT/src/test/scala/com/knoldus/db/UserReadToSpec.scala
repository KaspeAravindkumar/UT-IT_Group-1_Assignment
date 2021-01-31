package com.knoldus.db

import org.scalatest.flatspec.AnyFlatSpec

class UserReadToSpec extends AnyFlatSpec {
  val user = new UserReadTo

  //testcase-1

  "for valid user name " should "be success" in {
    val res = user.getUserByName("user1")
    assert(!res.isEmpty)
  }

  //testcase-2

  "for invalid user name" should "be failed" in {
    val res = user.getUserByName("user")
    assert(res.isEmpty)
  }
}
