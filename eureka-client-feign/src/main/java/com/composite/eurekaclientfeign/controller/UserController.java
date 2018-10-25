package com.composite.eurekaclientfeign.controller;

import com.composite.eurekaclientfeign.feign.EurekaFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private EurekaFeignClient eurekaFeignClient;

    @GetMapping("/user")
    public String findById() {
        String value = "";
        try {
            value = eurekaFeignClient.getUserInfo();
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
        return value;
    }


}
