package com.knoldus.db

import com.knoldus.models.User

import scala.collection.immutable.HashMap

/***
 * check valid user names
 */

class UserReadTo {
  val Admin1: User = User("user1", "lastName", 21, "email", "9123456789", "city", "knoldus")
  val Admin2: User = User("user2", "lastName1", 21, "email1", "9123456789", "city1", "knoldus")

  val users: HashMap[String, User] = HashMap("user1" -> Admin1, "user2" -> Admin2)

  def getUserByName(name: String): Option[User] = users.get(name)
}
