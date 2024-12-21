package com.example.spring_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Spring knows that its a REST controller
public class MainController {

    // This endpoint responds to GET requests on the root URL ("/")
    @GetMapping("/")
    public String home() {
        return "Hello, Spring Boot!";
    }
}
