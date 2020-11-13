package com.sample.demo.controller

import com.sample.demo.model.Message
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageQuestionController {

    @MessageMapping("/show-question")
    @SendTo("/question/get-question")
    fun send(message: String) : String {
        println(message)
        return "MAN CECCC"
    }
}