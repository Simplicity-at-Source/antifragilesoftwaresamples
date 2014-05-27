package com.simplicityitself.antifragilesoftware.asap.services

import com.simplicityitself.antifragilesoftware.asap.domain.SentimentAnalysis
import org.joda.time.DateTime

interface ASAPService {

  SentimentAnalysis performSentimentAnalysis(DateTime start, DateTime end)

}
