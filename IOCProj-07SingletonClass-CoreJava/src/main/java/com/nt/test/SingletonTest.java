package com.nt.test;

import com.nt.Ston.Printer;

public class SingletonTest {

	public static void main(String[] args)
	{
		
		Printer p1=Printer.InstanceOf();
		Printer p2=Printer.InstanceOf();
		
		System.out.println(p1.hashCode() +  " " + p2.hashCode() );
		
		System.out.println(p1 + "        " +p2);
		
		System.out.println("p1==p2 ?  =>" + (p1==p2));

	}

}
