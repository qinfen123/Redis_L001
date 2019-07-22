package com.fenqin.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
       SpringApplication.run(DemoApplication.class, args);
    }

}
