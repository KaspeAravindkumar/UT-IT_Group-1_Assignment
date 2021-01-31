package com.knoldus.models

/***
 * checks for valid employee parameters
 */

case class Employee(firstName: String,
                    lastName: String,
                    age: Int,
                    salary: Double,
                    designation: String,
                    companyName: String,
                    emailId: String)
