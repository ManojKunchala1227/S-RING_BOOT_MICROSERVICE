package com.mj.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

//@Entity

@Entity
@Table(name = "MEN")
@Data
//@NoArgsConstructor // If you need a no-args constructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Artist {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    
	
	  @SequenceGenerator(name="gen1",sequenceName ="arst_sqn",initialValue =1000,allocationSize = 1)
	  
	  @GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	 
    @Column(name = "Id")
    private Integer id;

    @NonNull
    @Column(name = "NAME", length = 40)
    private String name;

    @NonNull
    @Column(name = "CATEGORY", length = 30)
    private String category; // Fixed typo

    @NonNull
    @Column(name = "SALARY")
    private Double sal; // Removed length attribute
    
    
	
	 
	 
    
    
	  public Artist() 
	  {
	  
	  System.out.println("0-Arg Constructors ");
	  
	  }
	 
    
    
    
   
}
