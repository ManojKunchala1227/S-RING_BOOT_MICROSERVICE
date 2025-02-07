package com.mj.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="JPA_CUSTOMER")
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor

public class Customer 
{
	@Id
	@SequenceGenerator(name="gen_1",sequenceName="CNO_SEQ", initialValue=1000,allocationSize = 1)
	@GeneratedValue(generator="gen_1",strategy = GenerationType.SEQUENCE)
	private Integer cno;
	
	@Column(length=30)
	@NonNull
	private String cname;
	
	@Column(length=30)
	@NonNull
	private String caddrs;
	
	
	@OneToMany(targetEntity = PhoneNumber.class,cascade = CascadeType.ALL)
	@JoinColumn(name="CUSTOMER_ID", referencedColumnName = "CNO")
	private Set<PhoneNumber> phoneInfo;

	
	// toString

	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", cname=" + cname + ", caddrs=" + caddrs + "]";
	}
	
	
	

}
