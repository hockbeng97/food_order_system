package com.fos.web.api.service

import org.springframework.stereotype.Component

trait FoodOrderService {
  def addFoodOrderByUserId(userId: String): Unit

}
