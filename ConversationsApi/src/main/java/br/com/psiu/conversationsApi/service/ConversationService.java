package br.com.psiu.conversationsApi.service;

import br.com.psiu.conversationsApi.model.Conversation;
import br.com.psiu.conversationsApi.model.Message;
import br.com.psiu.conversationsApi.repository.ConversationRepository;
import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConversationService {

    @Autowired
    private ConversationRepository conversationRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * Perform update in messages or create a new conversation
     * @param message
     * @return
     */
    public ResponseEntity<Message> update(Conversation conversation) {
        if (this.updateMessageText(conversation.getId(), message.getText()))
            return new ResponseEntity<>(message, HttpStatus.OK);

        return new ResponseEntity<>(new Message(), HttpStatus.BAD_REQUEST);
    }
    public ResponseEntity<List<Message>> findAll() {
        return new ResponseEntity<>(conversationRepository.findAll(), HttpStatus.OK);
    }

    private boolean updateMessageText(Integer conversationId, Message message) {
        Query query = new Query(Criteria.where("_id").is(conversationId));
        Update update = new Update().push("messages", message);
        UpdateResult uResult = mongoTemplate.updateFirst(query, update, Message.class);
        if(uResult.getMatchedCount() > 0){
            return true;
        } return false;
    }

}
