package com.simplicityitself.antifragilesoftware.asap.chatserver

import com.simplicityitself.antifragilesoftware.asap.chatserver.web.controllers.ChatServerController
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@EnableAutoConfiguration
// @ComponentScan("com.simplicityitself.antifragilesoftware.asap.chatserver.web.controllers")
class Application {

  static ApplicationContext context

  static void main(String[] args) throws Exception {
    context = SpringApplication.run(Application, args);
  }

  static ApplicationContext getApplicationContext() {
    if (context == null) context = SpringApplication.run(Application, [] as String[]);
    return context;
  }

  @Bean
  ChatServerController chatServerController() {
    return new ChatServerController()
  }
}
