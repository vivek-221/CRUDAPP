package com.student.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestapiApplication {
	private static final Logger logger = LoggerFactory.getLogger(RestapiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
		logger.info("Spring boot application started....");
	}

}
