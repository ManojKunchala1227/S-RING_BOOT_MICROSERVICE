package com.mj.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mj.entity.Traveller;
import com.mj.repo.TravellerRepository;

@Service("Traveller_srv")
public class TravellerServiceImpl implements ITraveller_Service 
{
	@Autowired
	private TravellerRepository repo;

	@Override
	public String saveTravellerDetails(Traveller td) 
	{
		
		Integer id=repo.save(td).getTId();
		return id+"Traveller Details Saved Successfuly.....";
	}

	@Override
	public Iterable<Traveller> showAllTrv() {
		
		
		return repo.findAll();
		
	}

	


	@Override
	public Traveller findByID(Integer id) {
		 
		return repo.findById(id).orElseThrow(()->  new IllegalArgumentException ("Invalid"));  
	}
	
	@Override
	public String updateTraveller(Traveller td) {
		
		Optional<Traveller> optrv= repo.findById(td.getTId());
		
		if(optrv.isPresent())
		{
			Integer Tid=repo.save(td).getTId();
			return Tid+" Employee is Updated Successfull.......";
		}
		
		return optrv +"Entered Invalid Traveller Id";
	}

	@Override
	public String updateAdress(Integer id, String addrs) {
	
		Optional<Traveller> opr= repo.findById(id);
		
		if(opr.isPresent())
		{
			opr.get().setAdds(addrs);
			repo.save(opr.get());
		}
		
		
		return opr+"   Traveller Id is Invalid";
	}
	

	@Override
	public String deleteById(Integer id) {
		
		
		repo.deleteById(id);
		
		
		return "Traveller is Deleted Seccessfuly..";
	}

}
