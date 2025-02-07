package com.km.Factory;

import com.km.comp.DieselVehicle;
import com.km.comp.ElectricVehicle;
import com.km.comp.IEngine;
import com.km.comp.PetrolVehicle;
import com.km.comp.Vehicle;

public final class VehicleFactory 
{
	public static Vehicle getInstance(String vehicleType)
	{
		IEngine engine=null;
		
		if(vehicleType.equalsIgnoreCase("petrol"))
		engine= new PetrolVehicle();
		
		else if(vehicleType.equalsIgnoreCase("diesel"))
		engine=new DieselVehicle();
		else if (vehicleType.equalsIgnoreCase("electric"))
		engine=new ElectricVehicle();
		
		else 
			throw new IllegalArgumentException();
		
		Vehicle vehicle= new Vehicle();
		
		vehicle.setIEngine(engine);
		return vehicle ;
		
		
		
	}

}
