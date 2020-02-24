package com.termfrequency.api.beeblapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.annotation.Resource;

@SpringBootApplication
public class BeeblApiApplication {

    public static void main(String... args) {
        SpringApplication.run(BeeblApiApplication.class, args);
    }
}
