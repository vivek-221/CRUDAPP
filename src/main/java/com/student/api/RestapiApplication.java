package com.student.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan(basePackages = { "com.student.api.model" })
@ComponentScan(basePackages = { "com.student.api.service", "com.student.api.controller", "com.student.api.repository" })

public class RestapiApplication {
	private static final Logger logger = LoggerFactory.getLogger(RestapiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
		logger.info("Spring boot application started....");
	}

}
