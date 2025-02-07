package com.mj.interceptor;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class TimeCheckInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
			throws Exception 
	{
		LocalDateTime loc= LocalDateTime.now();
		int hour=loc.getHour();
		
		if(req.getServletPath().equalsIgnoreCase("/"))
		{
			return true;
		}
		
		else if(hour<9 || hour>17)
		{
			System.out.println("TimeCheckInterceptor.preHandle()");
			
			RequestDispatcher rd= req.getRequestDispatcher("/timeout.jsp");
			rd.forward(req, res);
			return false;
		
		}
		return true;
	
	}
}
