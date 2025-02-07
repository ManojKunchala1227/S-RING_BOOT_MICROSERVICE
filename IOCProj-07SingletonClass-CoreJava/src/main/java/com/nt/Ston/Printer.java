package com.nt.Ston;

public class Printer 
{
 private static Printer Instance;
 
 
 
 // 0-parameter constructor
 private Printer()
 {
	 System.out.println("0-parameter constructor");
	 
 }
  // Static Factory method having Logic
 
 public static Printer InstanceOf()
 {
	 if(Instance==null)
	 {
		 Instance=new Printer();
		 
	 }
	 
	 return Instance;
	 
 }
 
 
 

}
