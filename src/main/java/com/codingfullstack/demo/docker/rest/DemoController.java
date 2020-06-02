package com.codingfullstack.demo.docker.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codingfullstack.demo.docker.AppConfig;

@RestController
public class DemoController {

	@Autowired
	private AppConfig config;
	
	@GetMapping("/")
	public String hello() {
		return config.getMessage();
	}
	
}
