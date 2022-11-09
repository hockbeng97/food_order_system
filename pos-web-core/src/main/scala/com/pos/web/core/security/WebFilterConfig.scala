package com.pos.web.core.security

import org.springframework.boot.web.servlet.FilterRegistrationBean
import org.springframework.context.annotation.{Bean, Configuration}

@Configuration
class WebFilterConfig {

  private object filter extends AbstractCorsFilter

//  @Bean
//  def filterRegistrationBean: FilterRegistrationBean = {
//    val fgb = new FilterRegistrationBean(filter)
//    fgb.setOrder(Integer.MIN_VALUE + 1)
//    fgb
//  }

}
