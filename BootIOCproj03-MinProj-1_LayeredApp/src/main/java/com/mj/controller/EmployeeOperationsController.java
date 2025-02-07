package com.mj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mj.mode.Employee;
import com.mj.service.IEmployeeMgmtService;

@Controller("empController")
public class EmployeeOperationsController 
{
	@Autowired
	private IEmployeeMgmtService empService;
	
	public List<Employee> processEmployeesByDesgs(String desg1, String desg2,String desfg3) throws Exception
	{
		// Use Service 
		List<Employee> list=empService.techEmployeeByDesg(desg1, desg2, desg2);
		return list;
				
		
		}
	public String processEmployee(Employee emp) throws Exception
	{
		String resultMsg=empService.registerEmployee(emp);
		return resultMsg;
	}

}
