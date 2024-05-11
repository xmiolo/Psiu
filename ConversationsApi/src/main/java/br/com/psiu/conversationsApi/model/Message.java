package br.com.psiu.conversationsApi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "messages")
public class Message {
    @Id
    private String id;
    private String senderId;
    private String recipientId;
    private String content;
    private LocalDateTime timestamp;
    private String[] mediaUrls;

}
