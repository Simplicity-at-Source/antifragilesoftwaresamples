package com.simplicityitself.antifragilesoftware.asap.services

import spock.lang.Specification

public class DefaultASAPServiceSpec extends Specification {

    def"retrieve chatter posts and conduct sentiment analysis"()

    {
        given:
        ChatService chatService = Mock()
        def uut = new DefaultASAPService(chatService : chatService)

        when:
        def result = uut.performSentimentAnalysis(null)

        then:
        result == null
    }
}
