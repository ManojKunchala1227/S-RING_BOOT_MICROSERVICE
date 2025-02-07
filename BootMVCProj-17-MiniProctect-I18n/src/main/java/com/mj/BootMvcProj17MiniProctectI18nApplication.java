package com.mj;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class BootMvcProj17MiniProctectI18nApplication {
	
	@Bean(name="localResolver")//Fixed Bean ID
	public SessionLocaleResolver createResolver() 
	{
		   SessionLocaleResolver resolver= new SessionLocaleResolver();
		   resolver.setDefaultLocale(new Locale("en","US"));
		return resolver;
		
	}
	
	
	@Bean(name="lci") //any bean id can give
	public LocaleChangeInterceptor createInterceptor()
	{
		LocaleChangeInterceptor interceptor= new LocaleChangeInterceptor();
		
		interceptor.setParamName("lang");
		
		return interceptor;
	}
	

	public static void main(String[] args) {
		SpringApplication.run(BootMvcProj17MiniProctectI18nApplication.class, args);
	}

}
