package com.mj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mj.mode.Employee;
import com.mj.service.IEmployeeService;

@Controller("empController")
public class eMPLOYEEcONTROLLER
{
	@Autowired
	private IEmployeeService empService;
	
	public List<Employee> processEmployeesByDesgs(String desg1, String desg2,String desg3) throws Exception
	{
		// Use Service 
		List<Employee> list=empService.fechServiceByDesg(desg1, desg2, desg3);
		return list;
		
		
		
		
		
		
	}

}
