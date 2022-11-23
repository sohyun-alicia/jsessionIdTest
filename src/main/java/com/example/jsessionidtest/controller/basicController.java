package com.example.jsessionidtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class basicController {

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome, my guest";
    }

    @GetMapping("/userOnly")
    public String userOnly() {
        return "hello, user";
    }
}
