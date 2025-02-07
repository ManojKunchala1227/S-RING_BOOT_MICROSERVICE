package com.mj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mj.entity.BankOpening;
import com.mj.repository.BankRepository;

@Service("Service_Bank")
public class ServiceBank implements IBankService {

	@Autowired
	private BankRepository repo;
	@Override
	public String openAcount(BankOpening bo) 
	{
		long no=repo.save(bo).getAccountno();
	
		
		return "Bank account is Opend SeccessFuly.. Account No ::"+no;
	}
	@Override
	public String withdrallAmt(long atno, Double withd) 
	{
		BankOpening br=repo.findById(atno).orElseThrow(()-> new IllegalArgumentException("account not found"));
		
		br.setBalance(br.getBalance()-withd);
		
		repo.save(br);
		return "Withdrall amount Successful ::"+withd +"Remaining balance ::"+br.getBalance();
	}
	@Override
	public BankOpening showActNo(long no) {
		
		
		return repo.findById(no).orElseThrow(()-> new IllegalArgumentException("Invalid Account no"));
	}

}
