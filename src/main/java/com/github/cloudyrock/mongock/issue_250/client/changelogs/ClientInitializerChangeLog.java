package com.github.cloudyrock.mongock.issue_250.client.changelogs;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.github.cloudyrock.mongock.issue_250.client.Client;
import com.github.cloudyrock.mongock.issue_250.client.repo.ClientRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@ChangeLog(order = "1")
public class ClientInitializerChangeLog {

    public final static int INITIAL_CLIENTS = 10;

    @ChangeSet(id = "data-initializer-with-repository", order = "001", author = "mongock")
    public void dataInitializer(ClientRepository clientRepository) {

        java.lang.reflect.Proxy.getInvocationHandler(clientRepository);
        IntStream.range(0, INITIAL_CLIENTS)
                .mapToObj(i -> new Client("name-" + i, "email-" + i, "phone" + i, "country" + i))
                .collect(Collectors.toList())
                .forEach(clientRepository::save);
    }
}
