package com.mj.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Info")

public class Properties 
{
	
	//Injecting values from propeties1
	@Value("${per.id}")
	private int p1Id;
	@Value("${per.add}")
	private String p1Add;
	
	
	
	//Injecting values from properties file
	
	@Value("${per.id}")
	private int pid;
	@Value("${per.name}")
	private String pname;
	@Value("${per.bill}")
	private float billAmt;

	
	//We can hard Coding also
	// Injecting values Directly
	
	@Value("Hyd")
	private String Add;
	
	//Injecting System property values
	@Value("${os.name}")
	private String Osname;
	@Value("${os.version}")
	private String OsVersion;
	
	//Injecting Environment path
	
	@Value("${Path}")
	private String pathData;

	@Override
	public String toString() {
		return "Properties [pid=" + pid + ", pname=" + pname + ", billAmt=" + billAmt + ", Add=" + Add + ", Osname="
				+ Osname + ", OsVersion=" + OsVersion + ", pathData=" + pathData + "]";
	}
	
	 
	
	
}
