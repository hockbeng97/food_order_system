package com.fos.web.core

import com.fos.Fos
import com.fos.web.api.entity.TestOrderBean
import com.fos.web.core.dao.TestDao
import com.pos.web.api.service.FoodPaymentService
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.{ComponentScan, Configuration}
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@EnableJpaRepositories(basePackageClasses = Array(classOf[TestDao]))
@EntityScan(basePackageClasses = Array(classOf[TestOrderBean]))
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = Array(classOf[Fos], classOf[FoodPaymentService]))
class FosApplication
{

//  @Bean
//  private def corsFilter:FilterRegistrationBean =
//  {
//    val fgb = new FilterRegistrationBean(CorsFilter)
//    fgb.setOrder(Integer.MIN_VALUE + 1)
//    return fgb
//  }

}