package com.spring.spring_content.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String getMethodName() {
        return "Spring Boot Application is running";
    }
    
}
