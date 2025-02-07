package com.mj;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.mj.controller.EmployeeOperationsController;
import com.mj.mode.Employee;

@SpringBootApplication
public class BootIoCproj03MinProj1LayeredAppApplication {

	public static void main(String[] args) {
		
		//get IOC Container
		ApplicationContext ctx =SpringApplication.run(BootIoCproj03MinProj1LayeredAppApplication.class, args);
		
		// get Controller spring bean obj ref
		EmployeeOperationsController controller=ctx.getBean("empController",EmployeeOperationsController.class);
		
		
		/*
		 * Scanner s= new Scanner(System.in); System.out.println("Enter desg1::");
		 * String desg1=s.nextLine(); System.out.println("Enter desg2::"); String
		 * desg2=s.nextLine(); System.out.println("Enter desg3::"); String
		 * desg3=s.nextLine();
		 * 
		 * // Invoke theb.Method System.out.println("IM MANOJ"); try {
		 * 
		 * List<Employee> list=controller.processEmployeesByDesgs(desg1, desg2, desg3);
		 * 
		 * list.forEach(emp-> { System.out.println(emp); });
		 * 
		 * } catch(Exception e) { e.printStackTrace();
		 * System.out.println("Internal problem try again");
		 * 
		 */
		
		
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Name::");
		String name=s.nextLine();
		System.out.println("Enter JOb::");
		String job=s.nextLine();
		System.out.println("Enter Salary::");
		double salary=s.nextDouble();
		
		
		
		Employee emp= new Employee();
		
		emp.setName(name);
		emp.setJob(job);
		emp.setSalary(salary);
		
		try 
		{
			String msg=controller.processEmployee(emp);
			System.out.println(msg);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("OooooooooooMmmmmmm");
			
		}
		
		((ConfigurableApplicationContext) ctx).close();
		
	
		
		
	}

}
