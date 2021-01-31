package com.knoldus.validator

import com.knoldus.db.{CompanyReadto, EmployeeReadto}
import com.knoldus.models.Employee

/***
 * checks for valid employee details
 * checks for valid employee email Ids
 */

class EmployeeValidator(employeeRead: EmployeeReadto, validateEmail: EmailValidator) {

  def employeeIsValid(employee: Employee): Boolean = {

    val emailValid = validateEmail.emailIdIsValid(employee.emailId)
    val nameValid = employeeRead.getEmployeeByName(employee.firstName)
    if (emailValid == true && !nameValid.isEmpty)
      true
    else
      false
  }
}
