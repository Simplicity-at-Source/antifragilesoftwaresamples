package com.simplicityitself.antifragilesoftware.asap.services

import com.simplicityitself.antifragilesoftware.asap.domain.SentimentAnalysis
import org.joda.time.DateTime
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DefaultASAPService implements ASAPService {

  @Autowired
  ChatService chatService

  @Override
  SentimentAnalysis performSentimentAnalysis(DateTime start, DateTime end) {
       null
  }
}
