package com.simplicityitself.antifragilesoftware.asap.repositories

import com.simplicityitself.antifragilesoftware.asap.domain.DateTimeWindow
import com.simplicityitself.antifragilesoftware.asap.domain.SentimentAnalysis

interface SentimentAnalysisRepository {

  void storeSentimentAnalysis(SentimentAnalysis sentimentAnalysis)

  SentimentAnalysis retrieveSentimentAnalysis(DateTimeWindow window)
}
