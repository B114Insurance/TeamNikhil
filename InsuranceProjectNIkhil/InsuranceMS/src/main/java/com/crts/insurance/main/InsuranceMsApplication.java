package com.crts.insurance.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan
@EnableWebMvc
@EnableJpaRepositories
@SpringBootApplication
public class InsuranceMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceMsApplication.class, args);
		System.out.println("Main started");
	}

}
