 package com.mjcom.mj.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mj.entity.BankCostumer;
import com.mj.service.IBankModification;

@Component("me")
public class BankRunner implements CommandLineRunner
{
	@Autowired
	private IBankModification bm;
	@Override
	public void run(String... args) throws Exception 
	{
		
		
		
		
		 
		 
		
			
			  BankCostumer br= new BankCostumer();
			  
			  br.setName("JAYA"); br.setBalance(990000.00);
			  
			  try { String msg=bm.openingAcont(br); System.out.println(msg);
			  
			  } catch(Exception e) { e.printStackTrace();
			  System.out.println("Exception in Runner class");
			  
			  }
			 
		 
		
		
	}
}
