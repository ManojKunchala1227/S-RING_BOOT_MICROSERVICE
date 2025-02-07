package com.mj.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
//@ResponseBody
@RequestMapping("/welcome-api")
public class WelcometoOperationsRestController 
{
	@GetMapping("/welcome")
	public ResponseEntity<String> showhomepage()
	{
		
		return new ResponseEntity<String>("Welcome to Rest",HttpStatus.OK);
	}




}
