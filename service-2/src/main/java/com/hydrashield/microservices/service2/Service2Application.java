package com.hydrashield.microservices.service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Service2Application {

	public static void main(String[] args) {
		System.out.println("Service 2 Running");
		SpringApplication.run(Service2Application.class, args);
	}

}
