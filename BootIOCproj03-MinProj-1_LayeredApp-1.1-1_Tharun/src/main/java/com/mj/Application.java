package com.mj;

import java.io.Closeable;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.mj.controller.EmployeeOperatorsController;
import com.mj.mode.Employee;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Application.class, args);
		
		
		
		EmployeeOperatorsController controller=ctx.getBean("empController",EmployeeOperatorsController.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the desg1");
		String desg1=sc.next();
		System.out.println("Enter the desg2");
		String desg2=sc.next();
		System.out.println("Enter the desg3");
		String desg3=sc.next();
		
		try {
			List<Employee>list=controller.processEmployeesByDesg(desg1,desg2,desg3);
			
			
			list.forEach(emp->{
			
				System.out.println(emp);
				
			});
			}
			
			
		
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Internal problem..try again");
		}
		
		((ConfigurableApplicationContext) ctx).close();
	}
	

		
		
		
		
}


