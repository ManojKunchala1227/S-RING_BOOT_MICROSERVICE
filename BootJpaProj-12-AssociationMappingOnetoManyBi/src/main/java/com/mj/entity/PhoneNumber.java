package com.mj.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="JPA_CUSTOMER")
@Setter
@Getter


public class PhoneNumber 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer regNo;
	
	@Column(length=30)
	private Long mobileNo;
	@Column(length=30)
	private String provider;
	@Column(length=30)
	private String numberType;

	
	@ManyToOne(targetEntity =Customer.class,cascade = CascadeType.ALL)
	@JoinColumn(name="CUSTOMER_ID", referencedColumnName = "CNO")
	private Customer ct;


	@Override
	public String toString() {
		return "PhoneNumber [regNo=" + regNo + ", mobileNo=" + mobileNo + ", provider=" + provider + ", numberType="
				+ numberType + "]";
	}
	
	
}

