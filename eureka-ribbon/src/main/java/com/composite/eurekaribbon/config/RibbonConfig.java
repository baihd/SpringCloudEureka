package com.composite.eurekaribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 注入restTemplate的Bean，加上@LoadBalanced注解，此时RestTemplate结合了Ribbon开启了负载均衡功能
 * 注意：该类不应该在主应用程序上下文的@ComponentScan中
 */
@Configuration
public class RibbonConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
