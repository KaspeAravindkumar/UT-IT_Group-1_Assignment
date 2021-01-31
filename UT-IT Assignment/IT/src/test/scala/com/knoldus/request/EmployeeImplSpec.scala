package com.knoldus.request

import com.knoldus.db._
import com.knoldus.models.{Company, Employee}
import com.knoldus.validator.{CompanyValidator, EmailValidator, EmployeeValidator}
import org.scalatest.flatspec.AnyFlatSpec

class EmployeeImplSpec extends AnyFlatSpec{
  val employeeRead=new EmployeeReadto
  val emailValidat=new EmailValidator
  val employeeValid=new EmployeeValidator(employeeRead,emailValidat)
  val employeeImp=new EmployeeImpl(employeeValid)

  //testcase-1

  "for valid Employee parameters" should "be success" in{
    val employee1=Employee("kaspe","kumar",21,15000,"Intern","Knoldus","kaspe.kumar@knoldus.com")
    val res =employeeImp.createEmployee(employee1)
    assert(!res.isEmpty)
  }

  //testcase-2

  "for invalid Employee parameters" should "be failed" in{
    val employee1=Employee("kaspe","kumar",21,15000,"Intern","Knoldus","kaspe.kumar@knolds.test")
    val res =employeeImp.createEmployee(employee1)
    assert(res.isEmpty)
  }

  //testcase-3


  "for invalid Employee name" should "be failed" in{
    val employee1=Employee("name","email",21,15000,"Intern","Knoldus","kaspe.kumar@knolds.com")
    val res =employeeImp.createEmployee(employee1)
    assert(res.isEmpty)
  }
}