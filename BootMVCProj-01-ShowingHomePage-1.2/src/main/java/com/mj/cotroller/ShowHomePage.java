package com.mj.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomePage 
{
	@RequestMapping("/home")
	public String showHomePage()
	{
		return "welcome";
	}

}
