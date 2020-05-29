package com.codingfullstack.demo.docker.rest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/")
	public String hello() {
		return "Hello World";
	}
	
}
