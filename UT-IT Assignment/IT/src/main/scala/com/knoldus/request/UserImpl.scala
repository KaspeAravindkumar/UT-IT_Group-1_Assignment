package com.knoldus.request

import com.knoldus.models.User
import com.knoldus.validator.UserValidator

/***
 * checks for valid user parameters
 */

class UserImpl(userValidator: UserValidator) {
  def createUser(user: User): Option[String] = {
    if (userValidator.userValidator(user))
      Option(user.email)
    else None
  }
}
