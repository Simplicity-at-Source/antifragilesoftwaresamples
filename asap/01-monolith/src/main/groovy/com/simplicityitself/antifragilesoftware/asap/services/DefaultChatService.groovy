package com.simplicityitself.antifragilesoftware.asap.services

import com.simplicityitself.antifragilesoftware.asap.domain.RawChatData
import org.joda.time.DateTime

class DefaultChatService implements ChatService {

  @Override
  RawChatData retrieveChatDataFor(DateTime start, DateTime end) {
    return null
  }
}
