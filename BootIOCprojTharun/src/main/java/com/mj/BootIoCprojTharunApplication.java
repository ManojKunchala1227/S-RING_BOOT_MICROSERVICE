package com.mj;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.mj.sbeans.WishMesseage;

@SpringBootApplication
public class BootIoCprojTharunApplication {

	@Bean(name = "Id")
	public LocalDate createdate() {
		return LocalDate.now();
	}

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIoCprojTharunApplication.class, args);
		WishMesseage finder = ctx.getBean("sf", WishMesseage.class);

		String SeasonName = finder.findSeason();
		System.out.println("SeasonName::" + SeasonName);
		((ConfigurableApplicationContext) ctx).close();

	}

}
