package com.mj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.mj.config.Config;
import com.mj.sbeans.EVNTest;
import com.mj.sbeans.Properties;

public class mainTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		
		Properties pr=ctx.getBean("Info",Properties.class);
		
		
		System.out.println(pr);
		
		
		// Get Environment obj from IOC Container
		
		Environment ev=ctx.getEnvironment();
		
		System.out.println("per.id key value is ::"+ev.getProperty("per.id"));
		System.out.println("os.name key value is::"+ev.getProperty("os.name"));
		
		
		EVNTest evnt=ctx.getBean("EVNTest",EVNTest.class);
		System.out.println("----------------------------------");
		
		evnt.Display();
		
		
		ctx.close();

	}

}
