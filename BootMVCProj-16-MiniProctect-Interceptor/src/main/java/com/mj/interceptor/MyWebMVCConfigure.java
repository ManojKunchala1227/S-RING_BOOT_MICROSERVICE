package com.mj.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class MyWebMVCConfigure implements WebMvcConfigurer 
{
	@Autowired
	private TimeCheckInterceptor interceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry)
	{
		System.out.println("MyWebMVCConfigure.addInterceptors()");
			
		registry.addInterceptor(interceptor);
	}
	
	
	

}
