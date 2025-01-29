package com.test_app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MainAppTest {

  private final String BASE_URL = "http://localhost:8081/api/hello";

  @Test
  public void testHelloEndpoint() {
    RestTemplate restTemplate = new RestTemplate();
    String response = restTemplate.getForObject(BASE_URL, String.class);
    System.out.println(response);
    assertEquals("Hello, Jenkins!", response);
  }
}
