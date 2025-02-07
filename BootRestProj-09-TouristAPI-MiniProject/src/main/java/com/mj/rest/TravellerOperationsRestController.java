package com.mj.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mj.entity.Traveller;
import com.mj.service.TravellerServiceImpl;

@RestController
@RequestMapping("/Traveller-API")

public class TravellerOperationsRestController 
{
	@Autowired
	private TravellerServiceImpl travellerService;
	
	
	@PostMapping("/save")
	public ResponseEntity<String> saveProduct(@RequestBody Traveller traveller)
	{
		try
		{
			String msg=travellerService.registerTraveller(traveller);
			return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		}
		catch(Exception e)
		{
			
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);		
					}
		
		
		
		
	}
	//===========================================================================
	
	@GetMapping("/All")
	public ResponseEntity<?> showAllTravelles()
	{
		try
		{
			//use service
			
			List<Traveller> list=travellerService.showAllTravellers();
			return new ResponseEntity<List<Traveller>> (list,HttpStatus.OK);
		}
		catch (Exception e) 
		{
			return new ResponseEntity<String> (e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}

}
