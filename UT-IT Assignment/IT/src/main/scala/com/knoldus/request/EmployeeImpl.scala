package com.knoldus.request

import com.knoldus.models.Employee
import com.knoldus.validator.EmployeeValidator

/***
 * checks for valid employee parameters
 */

class EmployeeImpl(employeeValidator: EmployeeValidator) {

  def createEmployee(employee: Employee): Option[String] = {
    if (employeeValidator.employeeIsValid(employee))
      Option(employee.emailId)
    else None
  }
}
