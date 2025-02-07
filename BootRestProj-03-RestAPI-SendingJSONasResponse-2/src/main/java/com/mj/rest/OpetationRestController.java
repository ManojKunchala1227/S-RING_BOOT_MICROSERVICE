package com.mj.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mj.entity.Student;

@RestController
@RequestMapping("/Rest-APi")

public class OpetationRestController 
{
	
	
	
	@GetMapping("/save")
	
	public ResponseEntity<Student> save()
	{
		 Student st= new Student("Kunchala","MANOJ",20650311L);
		
		return new ResponseEntity<Student>(st,HttpStatus.OK);
	}

}
