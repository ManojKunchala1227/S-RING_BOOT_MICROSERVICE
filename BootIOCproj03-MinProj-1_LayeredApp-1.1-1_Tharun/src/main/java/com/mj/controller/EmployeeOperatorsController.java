package com.mj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mj.mode.Employee;
import com.mj.service.IEmployeeMgmtService;

@Controller("empController")
public class EmployeeOperatorsController {
	
	
	
	
		@Autowired
		private  IEmployeeMgmtService empService;
		
		
		public List<Employee> processEmployeesByDesg(String desg1,String desg2,String desg3)throws Exception{
			List<Employee> list=empService.fethEmployeesByDesgs(desg1,desg2,desg3);
			return list;
		}




}
