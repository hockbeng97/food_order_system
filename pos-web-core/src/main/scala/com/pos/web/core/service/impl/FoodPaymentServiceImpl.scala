package com.pos.web.core.service.impl

import com.pos.web.api.service.FoodPaymentService
import org.springframework.stereotype.Service

@Service
private[impl] class FoodPaymentServiceImpl extends FoodPaymentService {
  override def addPaymentByFoodOrderId(): Unit = println("Done Payment")
}
