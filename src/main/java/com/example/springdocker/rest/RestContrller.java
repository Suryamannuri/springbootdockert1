package com.example.springdocker.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestContrller {
	
	
	@RequestMapping("/test")
	public String SaveMethd() {
		return "This Is The first Jenkines Accunt";
	}

}
