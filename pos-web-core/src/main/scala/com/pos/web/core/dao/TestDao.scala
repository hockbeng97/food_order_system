package com.pos.web.core.dao

import com.pos.web.api.entity.TestPaymentBean

trait TestDao {
  def findByHello(hello:String):List[TestPaymentBean]
}
