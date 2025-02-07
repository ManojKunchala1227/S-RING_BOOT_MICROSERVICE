package com.mj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mj.entity.Traveller;
import com.mj.repository.TravellerRepository;

@Service("Traveller_Service")
public class TravellerServiceImpl implements TravellerService {

	@Autowired
	private TravellerRepository repo;
	
	
	
	@Override
	public String registerTraveller(Traveller t) 
	{
		
		int id= repo.save(t).getTid();
		
		return "Travelle registered Succussfully... ::"+id;
	}
	
	//======================================================================



	@Override
	public List<Traveller> showAllTravellers() 
	{
		
		return repo.findAll().stream().sorted((t1,t2)->t1.getTid().compareTo(t2.getTid())).toList();
	}

}
