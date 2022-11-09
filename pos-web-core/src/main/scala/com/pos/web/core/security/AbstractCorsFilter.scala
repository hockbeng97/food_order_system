package com.pos.web.core.security

import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component

import javax.servlet._
import javax.servlet.http.{HttpServletRequest, HttpServletResponse}

@Component
class AbstractCorsFilter extends Filter {

  protected def allowMethods:List[String] = List("POST","PUT","GET","OPTIONS","DELETE")
  protected def allowHeaders:List[String] = List("X-Requested-With", "accept", "authorization","content-type")
  protected def maxAge:Int = 3600
  protected def configuredAllowCredentials:Boolean = true

   override def doFilter(request: ServletRequest, response: ServletResponse, chain: FilterChain): Unit = {
     println("bobo filter")
     val httpResponse = response.asInstanceOf[HttpServletResponse]
     val httpRequest = request.asInstanceOf[HttpServletRequest]
     val origin = httpRequest.getHeader("Origin")

     httpResponse.setHeader("Access-Control-Allow-Origin", origin)
     httpResponse.setHeader("Access-Control-Allow-Methods", allowMethods.mkString(","))
     httpResponse.setHeader("Access-Control-Allow-Headers", allowHeaders.mkString(","))
     httpResponse.setHeader("Access-Control-Max-Age", maxAge.toString)
     httpResponse.setHeader("Access-Control-Allow-Credentials", configuredAllowCredentials.toString)

     if ("OPTIONS".equalsIgnoreCase(httpRequest.getMethod)) {
       httpResponse.setStatus(HttpServletResponse.SC_OK)
     }
     else {
       chain.doFilter(request, response)
     }
   }

  override def init(filterConfig:FilterConfig):Unit = {
    println("init filter")
  }

  override def destroy():Unit = {}

}


//    if (StringUtils.isNotBlank(allowOrigin) && allowOrigin != "null") {
//      httpResponse.setHeader("Access-Control-Allow-Origin", allowOrigin)
//    }
//    httpResponse.setHeader("Access-Control-Allow-Methods", if (StringUtils.isNotBlank(configuredAllowMethods)) configuredAllowMethods else allowMethods.mkString(","))
//    httpResponse.setHeader("Access-Control-Allow-Headers", if (StringUtils.isNotBlank(configuredAllowHeaders)) configuredAllowHeaders else allowHeaders.mkString(","))
//    httpResponse.setHeader("Access-Control-Max-Age", (if (configuredMaxAge >= 0) configuredMaxAge else maxAge).toString)
//    httpResponse.setHeader("Access-Control-Allow-Credentials", configuredAllowCredentials.toString)
