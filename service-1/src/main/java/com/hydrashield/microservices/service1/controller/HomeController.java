package com.hydrashield.microservices.service1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Value("${server.port}")
    private String port;
    @GetMapping("hello")
    public ResponseEntity<?> hello(){
        return ResponseEntity.ok("Hello from service 1, running on port: "+port+" ;)");
    }
}
