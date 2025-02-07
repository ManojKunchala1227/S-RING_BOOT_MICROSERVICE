package com.mj.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student-api")
//@Controller
//@ResponseBody
public class RestOperationsController 
{
	@GetMapping("/showreport")
	public ResponseEntity<String> showReport()
	{
		System.out.println("RestOperationsController.showreport()");
		
		return new ResponseEntity<String>("Report Generation Process",HttpStatus.OK);
	}
	
	
	@PostMapping("/registar")
	public ResponseEntity<String> registarStudent()
	{
		System.out.println("RestOperationsController.registarStudent()");
		
		return new ResponseEntity<String>("Student Registration Process",HttpStatus.CREATED);
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<String> editStudent()
	{
		System.out.println("RestOperationsController.editStudent()");
		
		return new ResponseEntity<String>("Student Edit Process (full Modification)",HttpStatus.OK);
		
	}
	
	
	@PatchMapping("/emailUpdate")
	public ResponseEntity<String> studentEmailUpdate()
	{
		System.out.println("RestOperationsController.studentEmailUpdate()");
		
		return new ResponseEntity<String>("Student Email Updation",HttpStatus.OK);
	}
	
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteStudent()
	{
		System.out.println("RestOperationsController.deleteStudent()");
		
		return new ResponseEntity<String>("Student Deletion Process ",HttpStatus.OK);
	}
	

}
