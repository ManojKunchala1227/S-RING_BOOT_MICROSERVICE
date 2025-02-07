package com.mj;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.mj.sbeans.SeansonFinder;

@SpringBootApplication
public class BootIocProj01DependencyINjectionApplication 
{
	@Bean(name="sb")
	public LocalDate createLDate()
	{
		
		return LocalDate.now();
		}

	public static void main(String[] args) {
		//get IOC Container
		ApplicationContext ctx= SpringApplication.run(BootIocProj01DependencyINjectionApplication.class, args);
		
		//Get Target class obj ref
		SeansonFinder sfinder=ctx.getBean("sf",SeansonFinder.class);
		//Invoke the b,method
		
		
		//System.out.println(sfinder.findSeason());
		
		String finder=sfinder.findSeason();
		System.out.println(finder);
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
