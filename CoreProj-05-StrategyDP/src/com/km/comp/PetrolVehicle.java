package com.km.comp;

public final class PetrolVehicle implements IEngine {


	@Override
	public void costomeized() {
		System.out.println("Customer Requirements ");
		
	}
	
	@Override
	public void testDrive() 
	{
		System.out.println("PetrolVehicle :: Test Driver");

	}

	@Override
	public void order() {
		System.out.println("PetrolVehicle :: Order");
		
		
	}

	@Override
	public void deliver() 
	{
		System.out.println("PetrolVehicle :: Deliver");
		
		
	}

}
