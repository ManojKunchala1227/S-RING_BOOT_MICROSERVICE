package com.km.comp;

public final class DieselVehicle implements IEngine {


	@Override
	public void costomeized() {
		System.out.println("DieselVehicle :: Customer Requirements ");
		
	}
	
	@Override
	public void testDrive() 
	{
		System.out.println("DieselVehicle :: Test Driver");

	}

	@Override
	public void order() {
		System.out.println("DieselVehicle :: Order");
		
		
	}

	@Override
	public void deliver() 
	{
		System.out.println("DieselVehicle :: Deliver");
		
		
	}

}
