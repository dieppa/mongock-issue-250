package com.github.cloudyrock.mongock.issue_250;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest(classes = MyAppApplicationTest.class)
@ComponentScan("com.github.cloudyrock.mongock.issue_250")
@TestPropertySource(properties= {"mongock.enabled=false"})
public class MyAppApplicationTest {

    @Test
    public void contextLoads() {
    }

}