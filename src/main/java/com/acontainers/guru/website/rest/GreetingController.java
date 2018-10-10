package com.acontainers.guru.website.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

	@GetMapping(produces={"text/plain"})
	public String getGreeting() {
		return "Hola";
	}
	
}
