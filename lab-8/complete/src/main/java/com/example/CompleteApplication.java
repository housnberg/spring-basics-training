package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MyConfigurationProperties.class)
public class CompleteApplication {

  public static void main(String[] args) {
    SpringApplication.run(CompleteApplication.class, args);
  }

}
