package com.mj.model;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("comm")
@Order(-1)
public class CustomerCommond implements CommandLineRunner,Ordered{

	@Override
	public void run(String... args) throws Exception {
		
		
		System.out.println("Customer CommandLine Runner :::"+Arrays.toString(args));
		
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 2;
	}

	
}
