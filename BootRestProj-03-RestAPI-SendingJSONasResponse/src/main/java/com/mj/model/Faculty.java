package com.mj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Faculty 
{
	private Integer fId;
	private String fName;
	private String qlfy;
	private String subject;
	private String addrs;

}
