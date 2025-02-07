package com.km.comp;

public final class ElectricVehicle implements IEngine {


	@Override
	public void costomeized() {
		System.out.println("ElectricVehicle :: Customer Requirements ");
		
	}
	
	@Override
	public void testDrive() 
	{
		System.out.println("ElectricVehicle :: Test Driver");

	}

	@Override
	public void order() {
		System.out.println("ElectricVehicle :: Order");
		
		
	}

	@Override
	public void deliver() 
	{
		System.out.println("ElectricVehicle :: Deliver");
		
		
	}

}
