package com.composite.eurekaclientsecond.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/userInfo")
    public String userInfo() {
        return "second user";
    }
}
