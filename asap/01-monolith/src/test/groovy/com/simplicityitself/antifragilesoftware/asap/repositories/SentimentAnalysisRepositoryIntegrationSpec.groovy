package com.simplicityitself.antifragilesoftware.asap.repositories

import com.simplicityitself.antifragilesoftware.asap.Application
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import spock.lang.Specification

class SentimentAnalysisRepositoryIntegrationSpec extends Specification {

  def "ensure calculated sentiment information can be persisted"() {
    given:
    def applicationContext = new AnnotationConfigApplicationContext(Application)
    def sentimentAnalysisRepository = applicationContext.getBean(RiakSentimentAnalysisRepository)

    when:
    def sentimentAnalysis = sentimentAnalysisRepository.retrieveSentimentAnalysis(null)

    then:
    sentimentAnalysis == null
  }
}
