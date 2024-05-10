package br.com.psiu.usersApi.controller;

import br.com.psiu.usersApi.model.User;
import br.com.psiu.usersApi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<User> getUser(@PathVariable Integer id) {
        return userService.findById(id);
    }
}
