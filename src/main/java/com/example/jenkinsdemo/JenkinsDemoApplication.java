package com.example.jenkinsdemo;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class JenkinsDemoApplication {

    @PostConstruct
    public void init(){
        log.info("Application started...");
    }
    public static void main(String[] args) {
        log.info("Application Executed...");
        SpringApplication.run(JenkinsDemoApplication.class, args);
    }

}
