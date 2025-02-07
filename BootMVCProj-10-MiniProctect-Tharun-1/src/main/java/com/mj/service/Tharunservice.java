package com.mj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mj.enenty.TharunBank;
import com.mj.repository.TharunRepository;
@Service("ser")
public class Tharunservice  implements ITharunservice
{
	@Autowired
	private TharunRepository rep;
	
	@Override
	public String saveTharun(TharunBank t) {
		
		rep.save(t);
		return "Seved";
	}

}
