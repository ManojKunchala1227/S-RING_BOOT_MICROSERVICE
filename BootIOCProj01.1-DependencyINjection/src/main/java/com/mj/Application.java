package com.mj;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.mj.sbeans.WishMassegeGenerator;

@SpringBootApplication
public class Application 
{
	@Bean(name="LocTime")
	public LocalTime LocTime()
	{
		return LocalTime.now();
	}

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx =SpringApplication.run(Application.class, args);
		
		//getting target spring been class obj 
		WishMassegeGenerator wishmsg=ctx.getBean("wish",WishMassegeGenerator.class);
		
		//invoke b.method
		String masseg=wishmsg.WishMasseage();
		System.out.println(masseg);
		
	}

}
