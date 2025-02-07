package com.mj.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("week")
public class WishingWeek
{
	@Autowired
	private LocalDate lw;
	
	//b.method 
	public String wish()
	{
		
		
		DayOfWeek day=lw.getDayOfWeek();
		
		
		
		
		if(DayOfWeek.SUNDAY != null || DayOfWeek.SATURDAY !=null)
			
		{
			return "Working Day";
		
		}
		else
		{
			return "Enjoy Your weekEnd";
			
		}
		
		
		/*
		 * DayOfWeek dayOfWeek = lw.getDayOfWeek(); // write method name and click
		 * ctrl+1
		 * 
		 * String string = dayOfWeek.toString();
		 * 
		 * 
		 * if(string.equalsIgnoreCase("Saturday") || string.equalsIgnoreCase("Sunday"))
		 * { return "Enjoy Your weekEnd"; } else { return "Working Day"; }
		 */
		
		
		
		
//		int ms=lw.getDayOfMonth();
//		if(ms>=2 || ms<7 ) 
//		{
//			return "happy working Day";
//			
//		}
//		else
//		{
//			return "Happy Week End";
//		}
		
		
		
//		
//		DayOfWeek msg=lw.getDayOfWeek();
//		
//		if(msg.MONDAY != null)
//		{
//			
//		}
	}
	

}
