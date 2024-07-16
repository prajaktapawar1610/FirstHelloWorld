package com.psp.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	
	
	@GetMapping("api/v1/hello1")
	public ResponseEntity<String> ping() {
		return new ResponseEntity<String>("Hello World from My first Project", HttpStatus.OK);
		
		
	}

}
