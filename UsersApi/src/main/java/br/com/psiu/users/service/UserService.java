package br.com.psiu.users.service;

import br.com.psiu.users.model.User;
import br.com.psiu.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<User> save(User user) {
        return new ResponseEntity<>(userRepository.save(user), HttpStatus.CREATED);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public void delete(User user) {
        this.userRepository.delete(user);
    }

    public ResponseEntity<User> findById(Integer id) {
        Optional<User> uptional = userRepository.findById(id);
        if (uptional.isPresent()) {
            return new ResponseEntity<>(uptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
