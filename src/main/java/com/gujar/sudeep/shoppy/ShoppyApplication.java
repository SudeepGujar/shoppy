package com.gujar.sudeep.shoppy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
public class ShoppyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppyApplication.class, args);
    }

}
