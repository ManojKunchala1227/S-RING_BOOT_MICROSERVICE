package com.mj.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("DEngine")
@Lazy(true)
public class DEngine implements IEngine {

	
	public DEngine() 
	{ 
		System.out.println("0- Desiel Engine parem constructor");
	}
	
	@Override
	public void start() {
		System.out.println("DEngine.start()- Started");
		
		
	}

	@Override
	public void end() {
		System.out.println("DEngine.end()- Ended");
		
	}
	
	/*
	 * public DEngine() { System.out.println("0- Desiel Engine parem constructor");
	 * }
	 * 
	 * @Override public void start() {
	 * System.out.println("DEngine.stat()- DEngine Stated");
	 * 
	 * }
	 * 
	 * @Override public void end() {
	 * System.out.println("DEngine.stat()- DEngine End");
	 * 
	 * }
	 */


}
