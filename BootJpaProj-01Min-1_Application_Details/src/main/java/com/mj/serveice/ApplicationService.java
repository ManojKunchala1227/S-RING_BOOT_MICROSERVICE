package com.mj.serveice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mj.enetity.Application_Details;
import com.mj.repository.IApplication_Repository;

@Service("Application_Service")
public class ApplicationService implements IApplicationService {

	@Autowired
	IApplication_Repository repo;
	@Override
	public String registerAplication(Application_Details ad) 
	{
		repo.save(ad);


		return "Registered Successfuly";
	}
	
	@Override
	public Optional<Application_Details> findbyid(int id) {
		
		
		
		return repo.findById(id);
	}

}
