package com.simplicityitself.antifragilesoftware.asap

import com.simplicityitself.antifragilesoftware.asap.services.ASAPService
import com.simplicityitself.antifragilesoftware.asap.services.ChatService
import com.simplicityitself.antifragilesoftware.asap.services.DefaultASAPService
import com.simplicityitself.antifragilesoftware.asap.services.DefaultChatService
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@EnableAutoConfiguration
class Application {

  static ApplicationContext context

  static void main(String[] args) throws Exception {
    context = SpringApplication.run(Application, args);
  }

  static ApplicationContext getApplicationContext() {
    if (context == null) context = SpringApplication.run(Application, [] as String[] );
    return context;
  }

  @Bean
  ChatService chatService() {
    new DefaultChatService()
  }

  @Bean
  ASAPService asapService() {
    new DefaultASAPService()
  }
}
