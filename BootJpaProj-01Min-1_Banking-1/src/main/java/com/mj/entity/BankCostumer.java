package com.mj.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity
@Table(name="ACCOUNT_ACCOUNT")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
 
public class BankCostumer

{
	@Id 
	@SequenceGenerator(name="gen1", sequenceName="act_sqn", initialValue = 10000000, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private long accountno;
	
	@NonNull
	@Column(length=30)
	private String name;
	
	@NonNull
	private Double balance;
	
	  @Version private Integer modificationCount;
	  
	  
	  @CreationTimestamp
	  
	  @Column(insertable = true, updatable = false) private LocalDateTime
	  openingDate;
	  
	  @Column(insertable=false, updatable=true) private LocalDateTime
	  lastlyOperatedOn;
	
	
	
	

}
