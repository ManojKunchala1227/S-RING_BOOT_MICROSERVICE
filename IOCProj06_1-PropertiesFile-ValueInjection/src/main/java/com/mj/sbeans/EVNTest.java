package com.mj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component("EVNTest")
public class EVNTest 
{
	@Autowired
	private Environment evn; //
	
	public void Display()
	{
		System.out.println(evn.getProperty("os.name"));
		System.out.println(evn.getProperty("per.id"));
	}

}
