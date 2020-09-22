package com.github.cloudyrock.mongock.issue_250;


import com.github.cloudyrock.mongock.issue_250.client.Client;
import com.github.cloudyrock.mongock.issue_250.client.repo.ClientRepository;
import com.github.cloudyrock.mongock.issue_250.client.repo.ClientRepositoryImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class ClientRepositoryIntegrationTest extends MongockIssue250ApplicationTest {


    private ClientRepository clientRepository;

//    @MockBean
    @Autowired
    private MongoTemplate mongoTemplate;

    @Before
    public void setUp() {
        clientRepository = new ClientRepositoryImpl(mongoTemplate);

    }

    @Test
    public void myTest() {}
}