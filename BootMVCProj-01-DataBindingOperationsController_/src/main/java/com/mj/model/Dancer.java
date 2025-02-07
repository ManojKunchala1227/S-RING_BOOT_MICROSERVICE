package com.mj.model;

import lombok.Data;

@Data
public class Dancer 
{
	private Integer did;
	private String name;
	private String add;
	private String typeOfDancer;
	private Float fee;
	
	
	public Dancer()
	{
		System.out.println("Dancer.Dancer:: 0 pram construction");
	}
	
}
