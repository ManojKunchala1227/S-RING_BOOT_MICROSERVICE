package com.mj.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("PEngine")
@Lazy(true)
public class PEngine implements IEngine {
	
	
	/*
	 * public PEngine() { System.out.println("0- Desiel Engine parem constructor");
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

	
	public PEngine()
	{
		System.out.println("0- Desiel Engine parem constructor");
	}
	  @Override public void start() {
	  
	  System.out.println("PEngine.start()-Started");
	  
	  }
	  
	  @Override public void end() { System.out.println("PEngine.end()-Ened");
	  
	  }
	 

}
