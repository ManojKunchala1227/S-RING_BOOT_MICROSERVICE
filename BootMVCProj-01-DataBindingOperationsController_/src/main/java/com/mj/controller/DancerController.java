package com.mj.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mj.model.Dancer;

@Controller
public class DancerController 
{
	@GetMapping("/")
	public String showHome()
	{
		System.out.println("Show Home Page");
		//LVN welcome page
		return "welcome";
	}
	
	@GetMapping("/register")
	public String dancerRegistrationPage()
	{
		System.out.println("Registration form");
		//LVN Dancer Registration form Page
		return "dancer_register_form";
	}
	
	@PostMapping("/register")
	public String registerdancer(@ModelAttribute("dancer") Dancer dancer, 
								Map<String,Object> map)
	{
		System.out.println("DancerController.registerdancer()");
		System.out.println("Model class Obj data::"+dancer);
		
		
		//b.Logic
		
		if(dancer.getFee()>10000)
		{
			map.put("feeRange","Costly Dance");
		}
		else if(dancer.getFee()<=0)
		{
			map.put("feeRance","Charity Dancer");
		}
		else
		{
			map.put("feeRance","Affordable Dancer");
		}
		
		//LVN
		return "show_result";
		
		
	}
	
	

}
