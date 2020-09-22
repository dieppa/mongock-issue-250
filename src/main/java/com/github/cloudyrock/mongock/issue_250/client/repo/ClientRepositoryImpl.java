package com.github.cloudyrock.mongock.issue_250.client.repo;

import com.github.cloudyrock.mongock.issue_250.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientRepositoryImpl  implements ClientRepository {
    private MongoTemplate mongoTemplate;

    @Autowired
    public ClientRepositoryImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public List<Client> getAllClients() {
        return mongoTemplate.findAll(Client.class);
    }

    public Client save(Client client) {
        return mongoTemplate.insert(client);
    }
}