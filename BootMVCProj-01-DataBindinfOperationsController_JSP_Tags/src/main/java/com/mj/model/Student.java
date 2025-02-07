package com.mj.model;

import lombok.Data;

@Data
public class Student 
{
	private Integer idNo;
	private String name;
	private String location="Hyderabad";
	private String course;
	private Float fee;

}
