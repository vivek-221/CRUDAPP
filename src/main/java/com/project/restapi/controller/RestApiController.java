package com.project.restapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

	
	@GetMapping("/home")
	public @ResponseBody ResponseEntity<String> get() {
	    return new ResponseEntity<String>("GET Response", HttpStatus.OK);
	}
	
	
}
