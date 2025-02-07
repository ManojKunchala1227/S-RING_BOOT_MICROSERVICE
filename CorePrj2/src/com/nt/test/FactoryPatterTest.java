package com.nt.test;

import com.nt.comps.Bike;
import com.nt.factory.BikeFactory;



public class FactoryPatterTest {

	public static void main(String[] args)
	{
		Bike b=BikeFactory.orderBike("SportsBike");
		b.drive();

	}

}
