package com.fos.web.core.mvc

import org.springframework.web.bind.annotation.{CrossOrigin, RequestMapping, RequestMethod, RestController}

import scala.jdk.CollectionConverters._
//import scala.collection.JavaConverters._



@RestController
@RequestMapping(value=Array("/rest/food-home/"), method = Array(RequestMethod.POST))
private class FoodHomeController {
  
  @RequestMapping(value = Array("print-tea"))
  def printTea(): java.util.List[String] = {
    val tea = Set[String]("bobo")
    tea.toList.asJava
  }



}
