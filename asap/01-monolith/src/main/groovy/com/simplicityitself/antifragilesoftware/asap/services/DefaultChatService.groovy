package com.simplicityitself.antifragilesoftware.asap.services

import com.simplicityitself.antifragilesoftware.asap.domain.DateTimeWindow
import com.simplicityitself.antifragilesoftware.asap.domain.RawChatData
import org.springframework.stereotype.Service

@Service
class DefaultChatService implements ChatService {

  @Override
  RawChatData retrieveChatDataFor(DateTimeWindow window) {
    null
  }
}
