package com.github.cloudyrock.mongock.issue_250;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@DataMongoTest
@ExtendWith(SpringExtension.class)
public class MongoDbSpringIntegrationTest {
    @DisplayName("Mongock issue 250 test")
    @Test
    public void test() {
    }
}
