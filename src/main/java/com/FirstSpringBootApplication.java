package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringBootApplication {
	private static final Logger log = LoggerFactory.getLogger(FirstSpringBootApplication.class);

	public static void main(String[] args) {
		log.info("Main method has been invoked");
		SpringApplication.run(FirstSpringBootApplication.class,args);
	}
}