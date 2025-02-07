package com.mj.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
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
	
	/*
	 * @RequestMapping("/home") public String mode(Model md) {
	 * 
	 * System.out.println("Model parameter"); md.addAttribute("sysDate", new
	 * Date()); md.addAttribute("age",new Random().nextInt(100));
	 * 
	 * return "welcome"; }
	 */
	
	@RequestMapping("/home")
	public String showHome(Map<String,Object> map)
	{
		/*
		 * map.put("name","Manoj"); //attribute
		 */
		
		
		
		//Array and Collections
		map.put("colors",new String[] {"red","white","yellow"});
		
		map.put("names",List.of("manoj","jayakrish","eswar"));
		map.put("phoneNo",Set.of(989898,787878,767676));
		map.put("idDetails",Map.of("AADHAR",9897964,"VOTER",45454));
	
		
		
		
		return "welcome";
	}
	
	
}
