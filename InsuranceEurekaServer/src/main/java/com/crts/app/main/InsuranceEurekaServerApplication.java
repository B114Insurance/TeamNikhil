package com.crts.app.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class InsuranceEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceEurekaServerApplication.class, args);
		System.out.println("done Eureka server 8081");
	}

}
