package com.fos.web.core.dao

import com.fos.web.api.entity.TestOrderBean

trait TestDao {
  def findByHello(hello:String):List[TestOrderBean]
}
