package com.crts.insurance.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class InsuranceCrApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(InsuranceCrApplication.class, args);
		System.out.println("done 8083");
	}

}
