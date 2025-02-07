package com.mj;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.mj.sbeans.WishingWeek;

@SpringBootApplication
public class Application {
	@Bean(name="ldate")
	
	public LocalDate lDate()
	{
		return LocalDate.now();
	}
	public static void main(String[] args) 
	{
		//get IOC Container
		ApplicationContext ctx=SpringApplication.run(Application.class, args);
		
		//get target class Spring bean Obj
		
		WishingWeek ww=ctx.getBean("week",WishingWeek.class);
		
		String wishmsg=ww.wish();
		System.out.println(wishmsg);
	}

}
