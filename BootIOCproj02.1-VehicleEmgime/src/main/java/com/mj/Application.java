package com.mj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.mj.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/mj/xml/applicationContext.xml")
public class Application
{

	public static void main(String[] args) 
	{
		
		  //getting IOC container 
		ApplicationContext ctx=SpringApplication.run(Application.class, args);
		  
		  // Getting Target class SptingBean Obj
		  
		  Vehicle v=ctx.getBean("vehicle",Vehicle.class); v.findEngine("Hyd",
		  "Tirupati");
		  
		  ((ConfigurableApplicationContext) ctx).close();
		 
		
		
		
		//Access to the IOC container
		
		/*
		 * ApplicationContext ctx=SpringApplication.run(Application.class, args);
		 * 
		 * // creating target spring been class obj
		 * 
		 * Vehicle vehicle=ctx.getBean("vehicle", Vehicle.class);
		 * 
		 * vehicle.startplace("Hyd", "Tirupathi"); ((ConfigurableApplicationContext)
		 * ctx).close();
		 */
	}

}
