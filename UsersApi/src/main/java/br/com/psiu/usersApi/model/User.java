package br.com.psiu.usersApi.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;

@Data
@Document("users")
public class User {
    @MongoId
    private Integer id;
    private String name;
    private String email;
    private String userName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean active;

    ////userService.createUser(new User(1, "Gregori", "ggrbediN@gmail.com", "gregs", LocalDateTime.now(), LocalDateTime.now(), Boolean.TRUE));
    public User(Integer id, String name, String email, String userName, LocalDateTime createdAt, LocalDateTime updatedAt, Boolean active) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.userName = userName;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.active = active;
    }
}
