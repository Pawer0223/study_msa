package com.examplz.secondservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/second-service")
public class SecondServiceController {
    @GetMapping("/welcome")
    public String index() {
        return "Welcome to the Second Service.";
    }
}
