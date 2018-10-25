package com.composite.eurekaclientfeign.feign;

import com.composite.eurekaclientfeign.config.FeignConfiguration;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/***
 * 使用@FeignClient的configuration属性，指定feign的配置类
 */
@Component
@FeignClient(name = "eureka-client", configuration = FeignConfiguration.class)
public interface EurekaFeignClient {

    /**
     * 使用feign自带的注解@RequestLine
     *
     * @return
     */
    @RequestLine("GET /userInfo")
    String getUserInfo();

}
