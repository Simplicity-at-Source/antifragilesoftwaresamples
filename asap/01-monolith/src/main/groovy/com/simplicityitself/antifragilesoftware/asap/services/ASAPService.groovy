package com.simplicityitself.antifragilesoftware.asap.services

import com.simplicityitself.antifragilesoftware.asap.domain.DateTimeWindow
import com.simplicityitself.antifragilesoftware.asap.domain.SentimentAnalysis

interface ASAPService {

  SentimentAnalysis performSentimentAnalysis(DateTimeWindow window)

}
