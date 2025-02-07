package com.mj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class Traveller_Personal_Details 
{
	@NonNull
	private String name;
	@NonNull
	private Integer age;
	
	private Integer height;
	
	private Integer weight;
	@NonNull
	private Long PhNo;
	@NonNull
	private String Adds;
	
	

}
