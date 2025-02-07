package com.mj.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeansonFinder 
{
	@Autowired
	LocalDate ld; //Field Injection HAS-A-PRPERTIE
	
	//b.method
	
	public String findSeason()
	{
		//get Current Month Value
		int month=ld.getMonthValue();
		
		
		
		if(month>=3 || month<=6)
		{
			return "Summer Season";
		}
		
		else if(month>=7 || month>=10)
		{
			return "Raining Season";
		}
		else
		{
			return "Winter Season";
		}
		
		/*
		 * if(month>=3 || month<=6) { return "Summer Season";
		 * 
		 * } else if(month>7 || month<=10) { return "Raining Season";
		 * 
		 * } else { return "Winter Season";
		 * 
		 * }
		 */
		
		
		
		
	}
	
	

}
