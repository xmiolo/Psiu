package br.com.psiu.conversationsApi.controller;

import br.com.psiu.conversationsApi.model.Conversation;
import br.com.psiu.conversationsApi.model.Message;
import br.com.psiu.conversationsApi.service.ConversationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/conversations")
public class ConversationController {

    @Autowired
    private ConversationService conversationService;

    @PostMapping("/update")
    public ResponseEntity<Message> createConversation(@RequestBody Conversation conversation){
        return conversationService.update(conversation);
    }

    @GetMapping("/find")
    public ResponseEntity<List<Message>> findAll(){
        return conversationService.findAll();
    }
}
