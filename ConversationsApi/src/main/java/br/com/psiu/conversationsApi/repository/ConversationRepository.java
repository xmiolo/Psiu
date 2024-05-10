package br.com.psiu.conversationsApi.repository;

import br.com.psiu.conversationsApi.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ConversationRepository extends MongoRepository<Message, Integer> {

}
