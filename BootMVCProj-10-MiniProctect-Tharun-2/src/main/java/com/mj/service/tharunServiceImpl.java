package com.mj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mj.enenty.TharunBank;
import com.mj.repository.TharunRepository;


@Service("ArtistService")
public class tharunServiceImpl implements ITharunService {
	@Autowired
	private TharunRepository repo;

	
	// Using Save() Method
	
	  @Override public String registerArtist(TharunBank art) {
	  
	  repo.save(art);
	  
	  
	  return "Registered ";
	  
	  }
	

}
