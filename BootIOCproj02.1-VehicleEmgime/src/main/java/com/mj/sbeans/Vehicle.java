package com.mj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle 
{
	
	/*
	 * @Autowired
	 * 
	 * @Qualifier("motor") private IEngine iengine; // Field Injection and
	 * HAS_A_PROPERTIE
	 * 
	 * //b.method\
	 * 
	 * public void startplace(String strt, String Ed) {
	 * System.out.println("Vehicle starting from ::"+strt); iengine.start();
	 * System.out.println("Vehicle Started from ::"+strt);
	 * 
	 * iengine.end(); System.out.println("Vehicle Ended ::"+Ed);
	 * 
	 * 
	 * 
	 * }
	 */
	
	
	
	 @Qualifier("motor")
	  @Autowired private IEngine ie; // HAS_A_RELATION
	 
	  
	  
	  //B. Method
	  
	  public void findEngine(String strt, String end) {
	  System.out.println("Vehicle Starting From::"+strt); ie.start();
	  
	  System.out.println("Vehicle Starting From::"+end); ie.end(); }
	 
	

}
