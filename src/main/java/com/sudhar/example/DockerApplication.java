package com.sudhar.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerApplication {

    private static final Logger logger = LoggerFactory.getLogger(DockerApplication.class);

    public static void main(final String[] args) {

        SpringApplication.run(DockerApplication.class, args);

        logger.info("Spring Docker application started.");
    }
}
