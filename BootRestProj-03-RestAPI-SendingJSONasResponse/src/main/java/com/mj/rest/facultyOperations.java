package com.mj.rest;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mj.model.Faculty;
import com.mj.model.Former;
import com.mj.model.Land;

@RestController
@RequestMapping("/faculty-api")
public class facultyOperations 
{
	
	@GetMapping("/report-1")
	public ResponseEntity<Faculty> showReport1()
	{
		Faculty faculty=new Faculty(1001,"Manoj","B.TEch","Mechanical","Hyd");
		
		faculty.setFId(1002);
		faculty.setFName("Jayan");
		faculty.setQlfy("MCA");
		faculty.setSubject("Java");
		faculty.setAddrs("Bengulur");
		
		
		
		return new ResponseEntity<Faculty> (faculty,HttpStatus.OK);
	}
	
	@GetMapping("/report-2")
	
	public ResponseEntity<Former> showReport2()
	{
		Land land = new Land(1234,"10Ace","Hydershakote","wet");
		
		
		/*
		 * Former former1= new Former(1004,"Veernaji","BandlagudaJagir", new String []
		 * {"red","yellow"},true,"paddy", List.of("raj","rani"), Set.of(9100L,98987L),
		 * Map.of("aadhar",910027),land);
		 */
		
		
		Former former= new Former();
		
		former.setFId(1004);
		former.setName("Veeranji");
		former.setAddrs("Bandlagida");
		former.setColous(new String[] {"red","yellw"});
		former.setIndian(true);
		former.setCropname("paddy");
		former.setNickName(List.of("raj","rani" ));
		former.setPhoneNo(Set.of(9100000000L,9849009098L));
		former.setIdDetails(Map.of("aadhar",990980));
		former.setLandDetails(land);
	
		
		
		
		
		return new ResponseEntity<Former>(former,HttpStatus.OK);
	}

}
