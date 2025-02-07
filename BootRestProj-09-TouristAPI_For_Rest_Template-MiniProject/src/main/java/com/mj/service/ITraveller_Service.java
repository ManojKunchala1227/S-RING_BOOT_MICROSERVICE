package com.mj.service;

import com.mj.entity.Traveller;

public interface ITraveller_Service 
{
	public String saveTravellerDetails(Traveller td);
	public Iterable<Traveller> showAllTrv();
	
	public Traveller findByID(Integer id);

	public String updateTraveller(Traveller td);
	public String updateAdress(Integer id, String addrs);
	public String deleteById(Integer id);
}
