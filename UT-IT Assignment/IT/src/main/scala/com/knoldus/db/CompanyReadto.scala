package com.knoldus.db

import com.knoldus.models.Company

import scala.collection.immutable.HashMap

/***
 * check valid company names
 * check valid comapny details
 *
 */
class CompanyReadto {

  val knoldus: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
  val philips: Company = Company("Philips", "philips123@gmail.com", "Noida")

  val companies: HashMap[String, Company] = HashMap("Knoldus" -> knoldus, "Philips" -> philips)

  def getCompanyByName(name: String): Option[Company] = companies.get(name)

}