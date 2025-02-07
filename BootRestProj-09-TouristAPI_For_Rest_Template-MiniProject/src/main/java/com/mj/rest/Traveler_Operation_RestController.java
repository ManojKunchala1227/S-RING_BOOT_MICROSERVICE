package com.mj.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mj.entity.Traveller;
import com.mj.service.ITraveller_Service;

@RestController
@RequestMapping("/Rest-Travller")
public class Traveler_Operation_RestController 
{
	@Autowired
	private ITraveller_Service TrvSrv;
	
	@PostMapping("/save")
	public ResponseEntity<String> savetravllerDetails(@RequestBody Traveller td)
	{
		try
		{
			String msg=TrvSrv.saveTravellerDetails(td);
			return new ResponseEntity<String>(msg,HttpStatus.OK);
			
		}
		catch(Exception e)
		{
			return new ResponseEntity<String> (e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		
		
		
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<?> findAll()
	{
		try
		{
			Iterable <Traveller> list= TrvSrv.showAllTrv();
			return new ResponseEntity<Iterable<Traveller>> (list,HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<String> (e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/findById/{id}")
	
	public ResponseEntity<?> showTravellerById(@PathVariable int id)
	{
		
		try
		{
			
			Traveller tr= TrvSrv.findByID(id);
			return new ResponseEntity<Traveller>(tr,HttpStatus.OK);
			
		}
		catch(Exception e)
		{
			return new ResponseEntity<String> (e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> updateTraveller(@RequestBody Traveller trv)
	{
		
		try
		{
			String msg= TrvSrv.updateTraveller(trv);
			return new ResponseEntity<String> (msg,HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<String> (e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	
	@PutMapping("/updateadds/{id}/{addrs}")
	
	public ResponseEntity<?> updateAdrss(@PathVariable int id, @PathVariable String addrs)
	{
		
		try
		{
			
			String msg= TrvSrv.updateAdress(id,addrs);
			return new ResponseEntity<String>(msg,HttpStatus.OK);
			
		}
		catch(Exception e)
		{
			return new ResponseEntity<String> (e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	


}
