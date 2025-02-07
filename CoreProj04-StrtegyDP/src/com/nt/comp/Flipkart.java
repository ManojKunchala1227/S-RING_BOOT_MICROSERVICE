package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {

private Courier courier; //HAS- A- Property

public void setCorier(Courier courier)
{
	System.out.println("Flipkart.setCourier");
	this.courier=courier;
	
}
	//b.method
	public String shopping(String items[], double price[])
	{
		double billAmount=0.0;
		for(double p:price)
		{
			billAmount=billAmount+p;
			
		}
		int oid=new Random().nextInt(1000);
		
		String msg=courier.deliver(oid);
		
		return Arrays.toString(items)+"Items with bill Amount" +billAmount+"-----"+msg;
		
	}



}
