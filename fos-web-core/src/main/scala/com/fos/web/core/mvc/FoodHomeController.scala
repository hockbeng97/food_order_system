package com.fos.web.core.mvc

import com.fos.web.api.service.FoodOrderService
import com.pos.web.api.service.FoodPaymentService
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

import javax.inject.Inject
import scala.jdk.CollectionConverters._


@RestController
@RequestMapping(value=Array("/rest/food-home/"), method = Array(RequestMethod.POST))
private class FoodHomeController {

  @Inject
  private var foodPaymentService: FoodPaymentService = _

  @Inject
  private var foodOrderService: FoodOrderService = _


  @RequestMapping(value = Array("print-tea"))
  def printTea(): java.util.List[String] = {
    foodOrderService.addFoodOrderByUserId("abc")
    val tea = Set[String]("bobo")
    tea.toList.asJava
  }



}
