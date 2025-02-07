package com.mj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class RequestParamController 
{
	
	@GetMapping("/home")
	public String homepage(@RequestParam int no, 
						   @RequestParam("sname") String name)
	{
		
		System.out.println("RequestParamController.homepage()");
		System.out.println("Data :: "+no+" "+name);
		
		
		
		//LVN
		return "welcome";
	}

}
