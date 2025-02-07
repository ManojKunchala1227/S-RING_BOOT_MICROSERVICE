package com.nt.test;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StretegyPatternTest {

	public static void main(String[] args) 
	{
		Flipkart flpk=FlipkartFactory.getInstance("dtdc");
		String resultMsg=flpk.shopping(new String[] {"Shirt","T-Shirt "}, new double[] {3300.0,4500.0});
		System.out.println(resultMsg);

	}

}
