package com.simplicityitself.antifragilesoftware.asap.chatserver.web.controllers

import groovy.json.JsonSlurper
import org.springframework.core.io.ClassPathResource
import spock.lang.Specification

class ChatServerControllerSpec extends Specification {

  def static EXPECTED_POSTS = new JsonSlurper().parse(new ClassPathResource("chat-posts.json").file)

  def "can retrieve json document from posts method on controller"() {
    given:
    ChatServerController chatServerController = new ChatServerController()

    when:
    def response = chatServerController.currentPosts()

    then:
    response == EXPECTED_POSTS
  }
}
