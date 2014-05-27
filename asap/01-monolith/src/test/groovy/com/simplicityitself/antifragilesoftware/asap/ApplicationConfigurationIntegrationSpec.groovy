package com.simplicityitself.antifragilesoftware.asap

import com.simplicityitself.antifragilesoftware.asap.services.DefaultASAPService
import com.simplicityitself.antifragilesoftware.asap.services.DefaultChatService
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import spock.lang.Specification

class ApplicationConfigurationIntegrationSpec extends Specification {

  def "ensure that appropriate services are present based on the application configuation"() {
      given:
      def applicationContext = new AnnotationConfigApplicationContext(Application)

    when:
    def chatService = applicationContext.getBean(DefaultChatService)
    def asapService = applicationContext.getBean(DefaultASAPService)

    then:
    chatService != null
    asapService != null
  }
}
