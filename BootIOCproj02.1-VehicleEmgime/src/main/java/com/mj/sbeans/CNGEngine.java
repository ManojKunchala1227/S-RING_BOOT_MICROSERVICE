package com.mj.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("CNGEngine")
@Lazy(true)
public class CNGEngine implements IEngine {

	public CNGEngine() { System.out.println("0- Desiel Engine parem constructor");
	 }
	  @Override public void start() {
	  System.out.println("CNGEngine.start()- Started");
	  
	  }
	  
	  @Override public void end() { System.out.println("CNGEngine.end()- Ended ");
	  }
	 
	
	
	/*
	 * public CNGEngine() {
	 * System.out.println("0- Desiel Engine parem constructor"); }
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
