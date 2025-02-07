package com.mj.enetity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name="Application_Details")


public class Application_Details 
{
	@Id
	@SequenceGenerator(name="gen_1", sequenceName = "app_details", initialValue = 1, allocationSize=1)
	@GeneratedValue(generator = "gen_1", strategy = GenerationType.SEQUENCE)
	private Integer applicationNo;
	
	@Column(length=20)
	@NonNull
	private String name;
	
	@Column(length=2)
	@NonNull
	private Integer age;
	
	@Column(length=30)
	@NonNull
	private String Qualification;
	
	
	@Lob
	@NonNull
	private byte[] photo;
	
	@Lob
	@NonNull
	private char[] resume;
	
	@NonNull
	private Boolean Indian;
	
	
	
	

}
