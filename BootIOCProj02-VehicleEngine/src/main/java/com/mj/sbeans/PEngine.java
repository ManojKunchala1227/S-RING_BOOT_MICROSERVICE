package com.mj.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("PEngine")
@Lazy(true)
public class PEngine implements IEngine {
	
	
	public PEngine()
	{
		System.out.println("0- parem constructor");
	}

	@Override
	public void stat() 
	{
		System.out.println("pEngine.stat() - Petrol Engine Started");

	}

	@Override
	public void end() {
		System.out.println("pEngine.stat() - Petrol Engine End");

	}

}
