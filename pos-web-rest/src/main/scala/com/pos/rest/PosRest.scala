package com.pos.rest

import com.pos.web.core.PosApplication
import org.slf4j.LoggerFactory
import org.springframework.boot.SpringApplication

object PosRest {
  private val logger = LoggerFactory.getLogger(this.getClass)

  def main(args: Array[String]): Unit = {
    val ctx = SpringApplication.run(classOf[PosApplication], args: _*)
    if(logger.isDebugEnabled())
    {
      ctx.getBeanDefinitionNames.sorted.foreach{ logger.debug(_)}
    }
  }
}
