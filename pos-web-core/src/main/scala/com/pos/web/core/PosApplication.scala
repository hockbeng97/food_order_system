package com.pos.web.core

import com.pos.Pos
import com.pos.web.api.entity.TestPaymentBean
import com.pos.web.core.dao.TestDao
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.{ComponentScan, Configuration}
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@EnableJpaRepositories(basePackageClasses = Array(classOf[TestDao]))
@EntityScan(basePackageClasses = Array(classOf[TestPaymentBean]))
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = Array(classOf[Pos]))
class PosApplication
{

//  @Bean
//  private def corsFilter:FilterRegistrationBean =
//  {
//    val fgb = new FilterRegistrationBean(CorsFilter)
//    fgb.setOrder(Integer.MIN_VALUE + 1)
//    return fgb
//  }

}