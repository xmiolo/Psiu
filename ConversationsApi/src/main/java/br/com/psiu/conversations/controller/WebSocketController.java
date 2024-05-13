package br.com.psiu.conversations.controller;

import br.com.psiu.conversations.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

@Controller
public class WebSocketController {
    //TODO
    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public Message sendMessage(Message message) throws Exception {
        return message;
    }
}
