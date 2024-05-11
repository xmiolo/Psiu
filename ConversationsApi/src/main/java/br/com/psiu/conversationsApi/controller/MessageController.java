package br.com.psiu.conversationsApi.controller;

import br.com.psiu.conversationsApi.model.Message;
import br.com.psiu.conversationsApi.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @PostMapping
    public ResponseEntity<?> sendMessage(@RequestBody Message message) {
        message.setTimestamp(LocalDateTime.now());

        messageService.sendMessage(message);
        return ResponseEntity.ok(message);
    }

    @GetMapping("/{userId1}/{userId2}")
    public ResponseEntity<?> getChatHistory(
            @PathVariable String userId1,
            @PathVariable String userId2) {

        List<Message> messages = messageService.getChatHistory(userId1, userId2);
        return ResponseEntity.ok(messages);
    }
}
