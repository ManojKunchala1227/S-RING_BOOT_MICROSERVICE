package com.km.test;

import com.km.Factory.VehicleFactory;
import com.km.comp.Vehicle;

public class VehicleTest {

	public static void main(String[] args) 
	{
		Vehicle vehicle=VehicleFactory.getInstance("diesel");
		System.out.println(vehicle);
		
		
		
		
		
		
		/*
		 * IEngine vehicle=VehicleFactory.getInstance("petrol"); 
		 * vehicle.costomeized();
		 * vehicle.testDrive(); 
		 * vehicle.order(); 
		 * vehicle.deliver();
		 */
		
		
		
		

	}

}
