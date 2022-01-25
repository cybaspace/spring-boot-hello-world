package com.example.springboot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	protected static final Logger LOG = LogManager.getLogger();
	protected String password = "supergeheim";

	@GetMapping("/")
	public String index() {
		LOG.info("Called index page in webapp - with password " + password);
		return "Greetings from Spring Boot!";
	}

}
