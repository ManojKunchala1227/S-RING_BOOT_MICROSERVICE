package com.mj.service;

import com.mj.entity.BankOpening;

public interface IBankService 
{
	public String openAcount(BankOpening bo);
	public String withdrallAmt(long atno,Double withd);
	public BankOpening showActNo(long no);

}
