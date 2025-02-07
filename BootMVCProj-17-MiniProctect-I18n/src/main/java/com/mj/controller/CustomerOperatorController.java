package com.mj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.mj.model.Customer;

@Controller
public class CustomerOperatorController 
{

	@GetMapping("/")
	public String showHomePage()
	{
		//LVN
		return "welcome";
	}
	
	
	@GetMapping("/register")
	public String registerPage(@ModelAttribute("cust") Customer cust)
	{
		return "customer_Register";
	}
	
	

}
