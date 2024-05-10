package br.com.psiu.conversationsApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "br.com.psiu.conversationsApi.repository")
public class ConversationsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConversationsApiApplication.class, args);
	}

}
