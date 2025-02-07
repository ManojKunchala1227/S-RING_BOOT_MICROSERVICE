package com.mj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mj.enenty.TharunBank;
import com.mj.repository.TharunRepository;
@Service("me")
public class ser implements ITharunservice {

	@Autowired
	TharunRepository repo;
	
	@Override
	public String saveTharun(TharunBank t) {
		 
		repo.save(t);
		return "ser saved";
	}

}
