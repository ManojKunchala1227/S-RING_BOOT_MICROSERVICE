package com.mj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mk.model.Login;

@Controller
public class LoginController 
{
	@GetMapping("/")
	public String Login()
	{
		System.out.println("Home Page");
		return "login";
	}
	
	
	@GetMapping("/Login")
	public String loginPage(@ModelAttribute("log") Login lon)
	{
		System.out.println("Login form page");
		System.out.println("Model data::"+lon);
		
		return "login_Form_Page";	
	}
	
	@PostMapping("/Login")
	public String resultpage(@ModelAttribute("log") Login lon)
	{
		System.out.println("result page");
		System.out.println("Model data::"+lon);
		
		return "result";	
	}
	
	

}
