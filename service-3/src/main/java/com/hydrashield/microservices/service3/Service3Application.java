package com.hydrashield.microservices.service3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Service3Application {

	public static void main(String[] args) {
		System.out.println("Service 3 Running");
		SpringApplication.run(Service3Application.class, args);
	}

}
