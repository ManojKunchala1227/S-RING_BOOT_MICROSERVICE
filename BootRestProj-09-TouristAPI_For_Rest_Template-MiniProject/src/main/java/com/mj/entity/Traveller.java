package com.mj.entity;

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
@Table(name="Traveller_Details")
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Traveller 
{
	@SequenceGenerator(name = "gen_1", sequenceName = "Traveler_id",initialValue=1000,allocationSize=1)
	@GeneratedValue(generator = "gen_1",strategy = GenerationType.AUTO)
	@Id
	private Integer tId;
	
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
	@NonNull
	private Boolean INDIAN;
	@NonNull
	private String locations;
//	@NonNull
//	private Traveller_Personal_Details td;

}
