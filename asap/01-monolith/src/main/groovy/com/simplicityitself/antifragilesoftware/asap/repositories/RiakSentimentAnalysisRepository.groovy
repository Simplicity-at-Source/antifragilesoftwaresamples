package com.simplicityitself.antifragilesoftware.asap.repositories

import com.simplicityitself.antifragilesoftware.asap.domain.DateTimeWindow
import com.simplicityitself.antifragilesoftware.asap.domain.SentimentAnalysis
import org.springframework.stereotype.Repository

@Repository
class RiakSentimentAnalysisRepository implements SentimentAnalysisRepository {

  // TODO Use the Riak Builder Groovy support.

  @Override
  void storeSentimentAnalysis(SentimentAnalysis sentimentAnalysis) {

  }

  @Override
  SentimentAnalysis retrieveSentimentAnalysis(DateTimeWindow window) {
    null
  }
}
