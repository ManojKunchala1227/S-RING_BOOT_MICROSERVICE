package com.mj.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wish")
public class WishMassegeGenerator 
{
	@Autowired
	private LocalTime lt; // Field Injection // HAS-A-RELATION
	
	
	// b.method
	public String WishMasseage()
	{
		int msg=lt.getHour();
		
		if(msg>=6 || msg<12)
		{
			return "Good Morning";
		}
		else if(msg>=12 || msg<15)
		{
			return "Good Offternoon";
		}
		else if(msg>=15 || msg<21)
		{
			return "Good Evening";
		}
		
		else
		{
			return "Good Night";
			
		}
		
	}
	

}
