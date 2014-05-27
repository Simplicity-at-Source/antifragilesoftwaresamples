package com.simplicityitself.antifragilesoftware.asap.chatserver.web.controllers

import groovy.json.JsonSlurper
import groovy.util.logging.Slf4j
import org.springframework.core.io.ClassPathResource
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@Slf4j
@RestController
class ChatServerController {

  def static POSTS = new JsonSlurper().parse(new ClassPathResource("chat-posts.json").file)

  @RequestMapping(value = "/api/chat/posts", method = RequestMethod.GET)
  @ResponseBody
  def currentPosts() {
    convertFailure { POSTS }
  }

  static convertFailure(Closure cl) {
    try {
      return cl()
    } catch (Exception ex) {
      ex.printStackTrace()
      return [failure:ex.message]
    }
  }
}
