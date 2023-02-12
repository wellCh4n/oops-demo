package com.example.oopsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class OopsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OopsDemoApplication.class, args);
    }

    @GetMapping
    public String hello() {
        return "hello";
    }
}
