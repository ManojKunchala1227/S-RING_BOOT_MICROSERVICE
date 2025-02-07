package com.mj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mj.entity.BankCostumer;
import com.mj.repository.BankRepository;

@Service("ArtistService")
public class BankAccountMgmtServiceImpl implements IBankModification {

	@Autowired
	private BankRepository brepo;
	
	@Override
	public String openingAcont(BankCostumer bc) 
	{
		
	  long idVal=brepo.save(bc).getAccountno();
		
		
		
		return "Bank  acount is Opened with the Acccount No::"+idVal;
	}
}
