package com.rodarte.webfluxeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class WebfluxEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebfluxEurekaApplication.class, args);
	}

}
