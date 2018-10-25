package com.composite.eurekaserversecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerSecurityApplication.class, args);
	}
}
