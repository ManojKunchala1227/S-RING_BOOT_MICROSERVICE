package com.nt.factory;

import com.nt.comps.Bike;
import com.nt.comps.BulletBike;
import com.nt.comps.ElectricBike;
import com.nt.comps.SportsBike;
import com.nt.comps.StandardBike;

public class BikeFactory 
{

	public static Bike orderBike(String name)
	{
		Bike bike = null;
		
		if(name.equalsIgnoreCase("BulletBIke"))
			bike=new BulletBike();
		else if(name.equalsIgnoreCase("ElectricBike"))
			bike=new ElectricBike();
			
		else if(name.equalsIgnoreCase("SportsBike"))
			bike=new SportsBike();
		else if(name.equalsIgnoreCase("StandardBike"))
			bike=new StandardBike();
	
		else
		{
			throw new IllegalArgumentException("Invalid Bike");
		}
		return bike;
		
	}

}
