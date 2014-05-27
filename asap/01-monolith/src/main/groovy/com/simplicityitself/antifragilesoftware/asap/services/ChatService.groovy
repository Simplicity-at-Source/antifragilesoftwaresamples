package com.simplicityitself.antifragilesoftware.asap.services

import com.simplicityitself.antifragilesoftware.asap.domain.DateTimeWindow
import com.simplicityitself.antifragilesoftware.asap.domain.RawChatData

interface ChatService {

  RawChatData retrieveChatDataFor(DateTimeWindow window)

}