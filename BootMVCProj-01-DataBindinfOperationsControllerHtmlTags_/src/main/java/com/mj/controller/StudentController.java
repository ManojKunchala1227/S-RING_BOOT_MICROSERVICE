package com.mj.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mj.model.Student;

@Controller
public class StudentController 
{
	@GetMapping("/")
	public String homePage()
	{
		System.out.println("StudentController.homePage - 0 arg Constructor ");
		//LVN
		return "welcome";
	}
	
	
	@GetMapping("register")
	public String formPage()
	{
		System.out.println("StudentController.formPage()- 0 args Constructor");
		//LVN
		return "formPage";
	}
	
	@PostMapping("register")
	
	public String result( Map<String,Object> map ,@ModelAttribute("stu")Student st)
	{
		System.out.println("Student Details :: "+st);
		
		String fee;
		
		if(st.getFee()>20000)
		{
			 fee= "costly";
		}
		else if(st.getFee()<=10000)
		{
			fee="Afertable";
		}
		else
		{
			fee="GOVT";
		}
		
		map.put("fee",fee);
		
		
		
		return "result";
	}
	

}
