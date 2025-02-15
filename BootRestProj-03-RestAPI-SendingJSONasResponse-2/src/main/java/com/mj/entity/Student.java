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
public class Student 
{
	@NonNull
	private String surName;
	@NonNull
	private String name;
	
	
	private Long rollNon;
	

}
