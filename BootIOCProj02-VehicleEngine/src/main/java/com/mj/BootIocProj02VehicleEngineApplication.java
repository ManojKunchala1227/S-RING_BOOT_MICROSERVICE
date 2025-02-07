package com.mj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.mj.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/mj/xml/applicationContext.xml")
public class BootIocProj02VehicleEngineApplication {

	public static void main(String[] args)
	{
		//Access to the IOC container
		
		ApplicationContext ctx=SpringApplication.run(BootIocProj02VehicleEngineApplication.class, args);
		
		// creating target spring been class obj
		
		Vehicle vehicle=ctx.getBean("vehicle", Vehicle.class);
		
		vehicle.startplace("Hyd", "Tirupathi");
		((ConfigurableApplicationContext) ctx).close();
	}

}
