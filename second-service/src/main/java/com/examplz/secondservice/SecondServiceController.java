package com.examplz.secondservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class SecondServiceController {
    @GetMapping("/second-service")
    public String index() {
        return "Welcome to the Second Service.";
    }
}
