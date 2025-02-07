package com.mj.entity;

import java.time.LocalDate;

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
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name="TRAVELLET_INFO")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor



public class Traveller 
{
	@SequenceGenerator(name="gen_1", sequenceName = "TID_SQE",allocationSize =100,initialValue = 1)
	@GeneratedValue(generator = "gen_1",strategy = GenerationType.AUTO)
	@Id
	private Integer tid;
	
	@NonNull
	@Column(length = 30)
	private String fName;
	
	@NonNull
	@Column(length = 100)
	private String fAddrss;
	
	@NonNull
	@Column(length = 30)
	private LocalDate dob;
	
	@NonNull
	@Column(length = 30)
	private Long mobileNo;

}
