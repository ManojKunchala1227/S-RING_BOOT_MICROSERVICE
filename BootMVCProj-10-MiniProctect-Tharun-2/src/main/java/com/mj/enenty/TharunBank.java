package com.mj.enenty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
//@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name="THARUN")
public class TharunBank 
{
	 @SequenceGenerator(name="gen1",sequenceName ="arst_sqn",initialValue =1000,allocationSize = 1)
	  
	  @GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	//@GeneratedValue(strategy = GenerationType.AUTO)
	 @Id
	Integer id;
	
    @NonNull
	String name;
	
	String job;
	
	@NonNull
	Double salary;

	
	public TharunBank()
	{
		System.out.println("entity class invoked");
		
	}
	
	
	
	
	
	

}
