package com.knoldus.db

import com.knoldus.models.Employee

import scala.collection.immutable.HashMap

/***
 * check valid employee details
 * check valid employee names
 */

class EmployeeReadto {
  val employee1 = Employee("kaspe", "kumar", 21, 15000, "Intern", "Knoldus", "kaspe.kumar@knoldus.com")
  val employee2 = Employee("firstName", "lastName", 21, 15000, "Designation", "Company", "email@domain.com")
  val employees: HashMap[String, Employee] = HashMap("kaspe" -> employee1, "Sample" -> employee2)

  def getEmployeeByName(name: String): Option[Employee] = employees.get(name)
}
