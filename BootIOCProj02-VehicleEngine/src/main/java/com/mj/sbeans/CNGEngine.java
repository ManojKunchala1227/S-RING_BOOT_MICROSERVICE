package com.mj.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("CNGEngine")
@Lazy(true)
public class CNGEngine implements IEngine {
	
	public CNGEngine()
	{
		System.out.println("0- parem constructor");
	}
	@Override
	public void stat() {
		System.out.println("CNGEngine.stat()- CNG Engine Started");

	}

	@Override
	public void end() {
		System.out.println("CNGEngine.stat()- CNG Engine Started");

	}

}
