package com.fos.web.core.security

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@Configuration
class WebSecurityConfig extends WebSecurityConfigurerAdapter{

  override protected def configure(httpSecurity: HttpSecurity): Unit = {
    httpSecurity.csrf().disable().authorizeRequests().antMatchers("/").permitAll()
//    httpSecurity.authorizeRequests.antMatchers("/").permitAll()
  }

}
