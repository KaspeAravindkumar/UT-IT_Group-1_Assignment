package com.knoldus.validator

import com.knoldus.db.CompanyReadto
import com.knoldus.models.Company

/***
 * checks for valid company details
 * checks for valid email Ids
 */

class CompanyValidator(companyRead: CompanyReadto, validateEmail: EmailValidator) {

  def companyIsValid(company: Company): Boolean = {

    val emailValid = validateEmail.emailIdIsValid(company.emailId)

    val nameValid = companyRead.getCompanyByName(company.name)

    if (emailValid == true && !nameValid.isEmpty)
      true
    else
      false

  }

}