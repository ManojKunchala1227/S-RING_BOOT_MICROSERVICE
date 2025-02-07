package com.mj.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controller_Class 
{
	@GetMapping("/")
	public String showHome(@RequestParam("st") int no,
							@RequestParam("sname") String[] name,
							@RequestParam("loc") List<String> ls,
							@RequestParam("setNo") Set<Long> nom)
	{
		System.out.println(no+" "+Arrays.toString(name)+" "+ls+" "+nom);
		return "welcome";
	}
}

