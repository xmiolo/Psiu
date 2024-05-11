package br.com.psiu.conversations.service;

import br.com.psiu.conversations.model.Message;
import br.com.psiu.conversations.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public Message sendMessage(Message message) {
        messageRepository.save(message);
        return message;
    }

    public List<Message> getChatHistory(String userId1, String userId2) {
        return messageRepository.findChatMessages(userId1, userId2);
    }

}