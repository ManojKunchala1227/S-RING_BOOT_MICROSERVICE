package com.mj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@SpringBootApplication
public class BootMvcProj01DataRenderingApplication {
	
	@Bean
	public RequestMappingHandlerMapping RMHM()
	{
	
		return new RequestMappingHandlerMapping();
		
	}
	
	
	public static void main(String[] args)
	{
		
		SpringApplication.run(BootMvcProj01DataRenderingApplication.class, args);
	}

}
