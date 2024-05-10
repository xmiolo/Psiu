package br.com.psiu.conversationsApi.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;

@Data
public class Message {
    //TODO verify if i need to pass conversationID here or if a will pass all conversation with only one message
    @MongoId
    private String id;
    private String senderId;
    private String text;
    private LocalDateTime timestamp;

}
