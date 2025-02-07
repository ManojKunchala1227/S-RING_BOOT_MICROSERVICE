package com.nt.factory;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.Flipkart;

public class FlipkartFactory 
{
	public static Flipkart getInstance(String courierType)
	{
		Courier courier=null;
		if(courierType.equalsIgnoreCase("dtdc"))
				courier=new DTDC();
		else if (courierType.equalsIgnoreCase("BluDart"))
			courier=new BlueDart();
		
		else 
			throw new IllegalArgumentException("Invalid courier type");
		
		
		Flipkart fpkt= new Flipkart();
		fpkt.setCorier(courier);
		
		
		return fpkt;
		
	}

}
