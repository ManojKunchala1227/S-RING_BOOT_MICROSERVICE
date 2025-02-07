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
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="emp")
@RequiredArgsConstructor
@AllArgsConstructor
//@NoArgsConstructor
@Data
public class Employee 
{
	@Id
	@SequenceGenerator(name="gen_1", sequenceName ="emp_id", initialValue = 10, allocationSize = 1)
	@GeneratedValue(generator ="gen_1", strategy = GenerationType.AUTO)
	
	private Integer id;
	
	
	
	//@NonNull
	@Column(length=30)
	public String name;
	
	//@NonNull
	@Column(length=30)
	private String role;
	
	//@NonNull
	//@Column(length=53)
	private Double salary;

}
