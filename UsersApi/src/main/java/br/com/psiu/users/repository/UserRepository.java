package br.com.psiu.users.repository;

import br.com.psiu.users.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface UserRepository extends MongoRepository<User, Integer> {

    @Query("{name:'?0'}")
    User findUserByName(String name);
}
