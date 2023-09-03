package com.hydrashield.microservices.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Service1Application {

	public static void main(String[] args) {
		System.out.println("Service 1 Running");
		SpringApplication.run(Service1Application.class, args);
	}

}
