package com.example.springboot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	protected static final Logger LOG = LogManager.getLogger();

	@GetMapping("/")
	public String index() {
		LOG.info("Called index page in webapp!");
		return "Greetings from Spring Boot!";
	}

}
