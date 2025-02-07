package com.mj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mj.Config.AppConfig;
import com.mj.sbeans.PersonInfo;

public class Test {

	public static void main(String[] args) {
		// Creating iOC Container

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		// Creating Spring Bean obj ref
		
		
		//PersonInfo in=ctx.getBean("pInfo",PersonInfo.class);
		
		
		PersonInfo info=ctx.getBean("pInfo",PersonInfo.class);
		System.out.println(info);
		
		/* System.out.println(in); */
		ctx.close();
		
		
		

	}

}
