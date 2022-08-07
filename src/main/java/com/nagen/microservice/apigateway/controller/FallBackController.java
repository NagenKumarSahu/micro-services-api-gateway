package com.nagen.microservice.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

	@GetMapping("/department-service-fallback")
	public String departmentServiceFallback() {
		return "Department Service is Down.......Please try after some time";
	}
	
	@GetMapping("/user-service-fallback")
	public String userServiceFallback() {
		return "User Service is Down.......Please try after some time";
	}
}
