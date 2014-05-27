package com.simplicityitself.antifragilesoftware.asap.chatserver.web.controllers

import com.simplicityitself.antifragilesoftware.asap.chatserver.Application
import groovy.json.JsonSlurper
import org.springframework.core.io.ClassPathResource
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import spock.lang.Specification

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup

class ChatServerControllerIntegrationSpec extends Specification {

  MockMvc mockMVC

  def static EXPECTED_POSTS = new JsonSlurper().parse(new ClassPathResource("chat-posts.json").file)

  def "can retrieve json document from http endpoint"() {
    given:
    ChatServerController chatServerController = Application.getApplicationContext().getBean(ChatServerController)
    mockMVC = standaloneSetup(chatServerController).build()

    when:
    def response = mockMVC.perform(MockMvcRequestBuilders.get("/api/chat/posts"))
    def json = new JsonSlurper().parseText(response.andReturn().getResponse().getContentAsString())

    then:
    json == EXPECTED_POSTS
  }
}
