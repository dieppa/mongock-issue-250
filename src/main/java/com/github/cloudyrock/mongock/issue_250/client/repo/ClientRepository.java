package com.github.cloudyrock.mongock.issue_250.client.repo;

import com.github.cloudyrock.mongock.issue_250.Mongock4Spring5SpringData3App;
import com.github.cloudyrock.mongock.issue_250.client.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository(Mongock4Spring5SpringData3App.CLIENTS_COLLECTION_NAME)
public interface ClientRepository { //extends MongoRepository<Client, String> {

    List<Client> getAllClients();

    Client save(Client client);


}
