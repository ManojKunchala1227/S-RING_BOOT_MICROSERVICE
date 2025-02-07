package com.mj.model;

import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("rn")
@Order(-9)
public class StudentRunner implements ApplicationRunner,Ordered
{

	@Override
	public void run(ApplicationArguments args) throws Exception 
	{
		System.out.println("Apllication Runner"+args.getSourceArgs());
		
		List<String> nonOptionArgs = args.getNonOptionArgs();
		 
		nonOptionArgs.forEach(System.out::println);
		
		args.getOptionNames().forEach(System.out::println);
		
		
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 10;
	}

	
	

}
