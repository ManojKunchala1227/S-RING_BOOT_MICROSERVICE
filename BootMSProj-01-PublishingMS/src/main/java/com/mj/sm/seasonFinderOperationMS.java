package com.mj.sm;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("seasion-api")
public class seasonFinderOperationMS 
{
	@Value("${spring.application.instance-id}")
	private String instance_Id;
	@GetMapping("/show-season")
	public ResponseEntity<String> findSeason()
	{
		LocalDateTime ld= LocalDateTime.now();
		
		int mounth=ld.getMonthValue();
		String seasonName=null;
		
		if(mounth>=7 && mounth<=10)
		
			seasonName="Rainy Season";
		
		else if(mounth>=3 && mounth<=6)
		
			seasonName="Summer Season";
			
		
		else 
			seasonName="Winter Season";
		
		//Improve the Out put
		seasonName=seasonName+" "+instance_Id;
			
			//Return the Response Entity Object
			
			return new ResponseEntity<String>(seasonName,HttpStatus.OK);
			
	}

}
