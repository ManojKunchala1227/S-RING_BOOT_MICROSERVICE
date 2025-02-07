package com.mj.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Former 
{
	
	private Integer fId;
	private String name;
	private String addrs;
	private String[] colous;
	private Boolean Indian;
	private String cropname;
	private List<String> nickName;
	private Set<Long> phoneNo;
	private Map<String,Object> idDetails;
	private Land landDetails;

}
