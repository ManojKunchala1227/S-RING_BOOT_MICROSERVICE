package com.mj.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mj.enenty.TharunBank;
import com.mj.service.ITharunService;

@Component("me")
public class TharunRunner implements CommandLineRunner {

	@Autowired
	ITharunService its;
	
	@Override
	public void run(String... args) throws Exception 
	{
		
		
		//1. 
		//TharunBank t1= new TharunBank(1,"Tharun","manager",555000.00);
		
		//TharunBank t2= new TharunBank("Tharun",555000.00);
		
		
		TharunBank t= new TharunBank();
		t.setName("Tharun");
		t.setJob("manager");
		t.setSalary(2344.00);
		
		
		/*
		 * //2. TharunServiceGPAY ts= new TharunServiceGPAY(); ts.saveTharun(t);
		 * 
		 * //3. TharunServicePHONEPAY tp= new TharunServicePHONEPAY(); tp.saveTharun(t);
		 */
		
		String msg= its.registerArtist(t);
		System.out.println(msg);
	}

}
