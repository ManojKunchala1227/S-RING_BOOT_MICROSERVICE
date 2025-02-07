package com.mj.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mj.entity.BankOpening;
import com.mj.service.IBankService;

@Component("Runner_Bank")
public class BankRunner implements CommandLineRunner {
	@Autowired
	private IBankService ibs;

	@Override
	public void run(String... args) throws Exception {

		Scanner s = new Scanner(System.in);

		/*
		 * System.out.println("Enther the Holder Name::"); String hName=s.nextLine();
		 * System.out.println("Enther the balance::"); Double bal=s.nextDouble();
		 * 
		 * 
		 * BankOpening bo= new BankOpening(); bo.setHolderName(hName);
		 * bo.setBalance(bal);
		 * 
		 * 
		 * bo.setHolderName("MANOJ"); bo.setBalance(1008876.0);
		 * 
		 * 
		 * try { String msg=ibs.openAcount(bo); System.out.println(msg);
		 * 
		 * } catch(Exception e) { e.printStackTrace();
		 * System.out.println("Exception raised at Runner class"); }
		 */
//=============================================================================================
		
		//Withdralll
		
		/*
		 * System.out.println("Enther the Account No:: "); Long actno=s.nextLong();
		 * System.out.println("Enther the Withdrall Amount::"); Double
		 * wamt=s.nextDouble(); try { String msg=ibs.withdrallAmt(actno, wamt);
		 * System.out.println(msg); } catch(Exception e) { e.printStackTrace();
		 * System.out.println("Exception raised at Runner class"); }
		 */
		
//==============================================================================================
		//Find the Acount 
		try
		{
			System.out.println("Enter the Account No::");
			Long ac=s.nextLong();
			BankOpening br= ibs.showActNo(ac);
			System.out.println("Account Modified ::"+br.getModificationCount()+"::time");
			System.out.println("Account is Opend in::"+br.getOpeningDate());
			System.out.println("Account is Lastly Opend in::"+br.getLastlyOperatedOn());
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		s.close();
	}

}
