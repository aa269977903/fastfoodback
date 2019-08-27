package com.cest.fastfoodback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FastfoodbackApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastfoodbackApplication.class, args);
    }

    @RequestMapping("/")
    public String test() {
        return "Hello SpringBoot";
    }
}
