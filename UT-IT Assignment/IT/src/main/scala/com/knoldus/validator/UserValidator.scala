package com.knoldus.validator

import com.knoldus.db.{CompanyReadto, UserReadTo}
import com.knoldus.models.{Company, User}

/***
 * checks for valid user parameters
 * checks for valid user mail Ids
 * checks for valid company parameters
 */

class UserValidator(userReadTo: UserReadTo, validateEmail: EmailValidator, companyReadto: CompanyReadto) {

  def userValidator(user: User): Boolean = {

    val emailValid = validateEmail.emailIdIsValid(user.email)
    val nameValid = userReadTo.getUserByName(user.firstName)
    val company = companyReadto.getCompanyByName(user.companyName)
    if (emailValid == true && !nameValid.isEmpty && !company.isEmpty)
      true
    else
      false

  }
}