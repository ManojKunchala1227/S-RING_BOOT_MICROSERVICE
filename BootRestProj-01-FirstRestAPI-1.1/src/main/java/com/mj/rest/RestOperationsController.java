package com.mj.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest-api")
//@Controller
//@ResponseBody
public class RestOperationsController 
{
	@GetMapping("/welcome")
	
	public ResponseEntity<String> showwelcome()
	{
		return new ResponseEntity<String>("Welcome to Rest", HttpStatus.OK);
	}

}
