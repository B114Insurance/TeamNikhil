package com.crts.insurance.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableEurekaClient
@EnableJpaRepositories
@SpringBootApplication
public class InsuranceMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceMsApplication.class, args);
	}

}
