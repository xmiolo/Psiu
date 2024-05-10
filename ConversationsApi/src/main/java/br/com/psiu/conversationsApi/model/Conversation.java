package br.com.psiu.conversationsApi.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document("conversations")
public class Conversation {
    @MongoId
    private String id;

    private List<UserReference> participants;

    private List<Message> messages;

    private String title;
    private LocalDateTime createdAt;
    private LocalDateTime lastUpdated;
    private boolean isGroupConversation;
}
