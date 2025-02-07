package com.mj.controller;

import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homepgae 
{
	/*
	 * @RequestMapping("/home") public String homePageView() {
	 * 
	 * return "welcome"; //Logical View Name }
	 */

	
	/*
	 * @RequestMapping("/home") public String homePagesView(Map<String,Object> map)
	 * { map.put("sysDate", new Date()); map.put("age", new Random().nextInt(100));
	 * return "welcome"; }
	 */
	
	@RequestMapping("/home")
	public String mode(Model md)
	{
		
		System.out.println("Model parameter");
		md.addAttribute("sysDate", new Date());
		md.addAttribute("age",new Random().nextInt(100));
		
		return "welcome";
	}
}
