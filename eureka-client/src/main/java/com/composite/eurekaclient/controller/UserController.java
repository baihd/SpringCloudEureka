package com.composite.eurekaclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @GetMapping("/userInfo")
    @ResponseBody
    public String userInfo() {
        return "user is test";
    }
}
