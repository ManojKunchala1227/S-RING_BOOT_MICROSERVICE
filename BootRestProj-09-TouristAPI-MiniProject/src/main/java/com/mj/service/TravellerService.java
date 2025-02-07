package com.mj.service;

import java.util.List;

import com.mj.entity.Traveller;

public interface TravellerService 
{
	public String registerTraveller(Traveller t);
	public List<Traveller> showAllTravellers();

}
