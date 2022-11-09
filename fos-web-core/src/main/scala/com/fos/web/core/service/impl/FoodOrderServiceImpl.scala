package com.fos.web.core.service.impl

import com.fos.web.api.service.FoodOrderService
import org.springframework.stereotype.Service

@Service
private[impl] class FoodOrderServiceImpl extends FoodOrderService  {

  override def addFoodOrderByUserId(userId: String): Unit = {
    println("Add Food Order Success !!!")
  }
}
