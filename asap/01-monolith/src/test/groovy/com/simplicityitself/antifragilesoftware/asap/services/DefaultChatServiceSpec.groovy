package com.simplicityitself.antifragilesoftware.asap.services

import spock.lang.Specification

class DefaultChatServiceSpec extends Specification {

  def "perform retrieval of chat data for a given date/time window"() {
    given:
    def uut = new DefaultChatService()

    when:
    def response = uut.retrieveChatDataFor(null)

    then:
    response == null
  }
}
