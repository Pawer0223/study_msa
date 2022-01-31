package com.examplz.secondservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/second-service")
public class SecondServiceController {
    @GetMapping("/welcome")
    public String index() {
        return "Welcome to the Second Service.";
    }

    @GetMapping("/message")
    public String message(@RequestHeader("second-request") String header) {
        log.info("header : {}", header);
        return "Hello World in second Service.";
    }
}
