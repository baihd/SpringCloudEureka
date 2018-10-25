package com.composite.eurekaserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/getService")
    public String serviceUrl() {
        List<String> services = discoveryClient.getServices();
        System.out.println(services.size());
        return null;
    }

}
