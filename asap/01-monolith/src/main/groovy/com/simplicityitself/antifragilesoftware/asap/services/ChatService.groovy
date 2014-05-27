package com.simplicityitself.antifragilesoftware.asap.services

import com.simplicityitself.antifragilesoftware.asap.domain.RawChatData
import org.joda.time.DateTime

interface ChatService {

  RawChatData retrieveChatDataFor(DateTime start, DateTime end)

}