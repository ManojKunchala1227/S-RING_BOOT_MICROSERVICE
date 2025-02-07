package com.mj;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mj.controller.eMPLOYEEcONTROLLER;
import com.mj.mode.Employee;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//Get IOC Container
		ApplicationContext ctx=SpringApplication.run(Application.class, args);
		
		eMPLOYEEcONTROLLER contro=ctx.getBean("empController",eMPLOYEEcONTROLLER.class);
		
		
		
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter desg1::");
		String desg1=s.nextLine();
		System.out.println("Enter desg2::");
		String desg2=s.nextLine();
		System.out.println("Enter desg3::");
		String desg3=s.nextLine();
		
		
		
		try
		{
			List<Employee> list=contro.processEmployeesByDesgs(desg1, desg2, desg3);
			list.forEach(emp->
			{
				System.out.println(emp);
			});
			
		}
		catch(Exception e) 
		{ e.printStackTrace();
			System.out.println("Internal proble");
		}
		
		
		
		
		
	}

}
