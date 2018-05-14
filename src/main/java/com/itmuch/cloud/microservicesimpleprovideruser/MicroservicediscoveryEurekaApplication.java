package com.itmuch.cloud.microservicesimpleprovideruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroservicediscoveryEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicediscoveryEurekaApplication.class, args);
	}
}
