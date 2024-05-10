package br.com.psiu.usersApi.repository;

import br.com.psiu.usersApi.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserRepository extends MongoRepository<User, Integer> {

    @Query("{name:'?0'}")
    User findUserByName(String name);
}
