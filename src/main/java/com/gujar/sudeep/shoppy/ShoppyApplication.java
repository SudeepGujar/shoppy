package com.gujar.sudeep.shoppy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
@EnableMongoRepositories(basePackages = "com.gujar.sudeep.shoppy.repository")
public class ShoppyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppyApplication.class, args);
    }

}
