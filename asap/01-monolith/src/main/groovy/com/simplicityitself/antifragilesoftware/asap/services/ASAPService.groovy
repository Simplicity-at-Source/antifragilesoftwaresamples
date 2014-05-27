package com.simplicityitself.antifragilesoftware.asap.services

import com.simplicityitself.antifragilesoftware.asap.domain.SentimentAnalysis

interface ASAPService {

  SentimentAnalysis performSentimentAnalysis(Formatter.DateTime start, Formatter.DateTime end)

}
