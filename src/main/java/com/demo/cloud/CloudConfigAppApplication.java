package com.demo.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigAppApplication {

  public static void main(String[] args) {
    SpringApplication.run(CloudConfigAppApplication.class, args);
  }

}
