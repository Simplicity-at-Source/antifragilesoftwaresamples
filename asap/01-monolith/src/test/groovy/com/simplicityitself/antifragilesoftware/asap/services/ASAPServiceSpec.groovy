package com.simplicityitself.antifragilesoftware.asap.services

import spock.lang.Specification

public class ASAPServiceSpec extends Specification {

    def"retrieve chatter posts and conduct sentiment analysis"()

    {
        given:
        ASAPService asap = new DefaultASAPService()

        when:
        def result = asap.performSentimentAnalysis(null, null)

        then:
        result == null
    }
}
