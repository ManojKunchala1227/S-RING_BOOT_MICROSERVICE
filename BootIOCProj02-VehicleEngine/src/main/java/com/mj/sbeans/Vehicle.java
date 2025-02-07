package com.mj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle 
{
	@Qualifier("motor")
	@Autowired
	private IEngine iengine; // Field Injection and HAS_A_PROPERTIE
	
	//b.method\
	
	public void startplace(String strt, String Ed)
	{
		System.out.println("Vehicle starting from ::"+strt);
		iengine.stat();
		System.out.println("Vehicle Started from ::"+strt);
		
		iengine.end();
		System.out.println("Vehicle Ended ::"+Ed);
		
		
		
	}
	
	

}
