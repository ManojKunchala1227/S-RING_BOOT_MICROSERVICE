package com.mj.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class check 
{
	@GetMapping("/msg")
	public ResponseEntity<String> me()
	{
		return new ResponseEntity<String>("comming",HttpStatus.OK);
	}
	

}
