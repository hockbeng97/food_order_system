package com.fos.rest

import com.fos.web.core.FosApplication
import org.slf4j.LoggerFactory
import org.springframework.boot.SpringApplication

object FosRest {
  private val logger = LoggerFactory.getLogger(this.getClass)

  def main(args: Array[String]): Unit = {
    val ctx = SpringApplication.run(classOf[FosApplication], args: _*)
    if(logger.isDebugEnabled())
    {
      ctx.getBeanDefinitionNames.sorted.foreach{ logger.debug(_)}
    }
  }
}
