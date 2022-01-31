package com.example.firstservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class FirstServiceController {
    @GetMapping("/first-service")
    public String index() {
        return "Welcome to the First Service.";
    }
}
