package com.mj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@SpringBootApplication
public class Application {
	@Bean
	public RequestMappingHandlerMapping createRMHM()
	{
		return new RequestMappingHandlerMapping();
		
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
