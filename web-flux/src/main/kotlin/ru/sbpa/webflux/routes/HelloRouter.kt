package ru.sbpa.webflux.routes

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.RequestPredicates.GET
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.RouterFunctions
import org.springframework.web.reactive.function.server.ServerResponse


@Configuration(proxyBeanMethods = false)
class HelloRouter {

  @Bean
  fun hello(helloHandler: HelloHandler): RouterFunction<ServerResponse> {
       return RouterFunctions.route(GET("/hello"), helloHandler::hello)
  }

}