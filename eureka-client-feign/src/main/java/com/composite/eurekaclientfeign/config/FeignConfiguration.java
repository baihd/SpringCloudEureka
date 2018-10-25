package com.composite.eurekaclientfeign.config;

import com.composite.eurekaclientfeign.annotation.ExcludeComponent;
import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 该类为Feign的配置类
 * 注意：该类不应该在主应用程序上下文的@CompantScan中
 */
@ExcludeComponent
@Configuration
public class FeignConfiguration {

    /**
     * 用feign.Contract.Default替换SpringMvcContract契约
     *
     * @return
     */
    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }
}
