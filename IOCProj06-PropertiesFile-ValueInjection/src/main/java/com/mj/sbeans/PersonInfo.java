package com.mj.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pInfo")
//@PropertySource(value="com.mj.commons/Info.properies")
public class PersonInfo 
{
	
	// Injecting the values from properties file
	@Value("${per.id}")
	private int pid;
	@Value("${per.name}")
	private String pname;
	@Value("${per.billamt}")
	private float Amt;
	
	// Injecting the value Directly
	
	// We Can use hard cording also
	@Value("Hyd")				
	private String Add; 		// Directly also we can write Hard Cording Like " private String Add= "Hyd" "
	
	
	// Injecting System property Value
	
	@Value("${os.name}")
	private String osName;
	@Value("${os.version}")
	private String version;
	
	
	//Injecting the Environment values
	@Value("${Path}")
	private String pathData;


	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", pname=" + pname + ", Amt=" + Amt + ", Add=" + Add + ", osName=" + osName
				+ ", version=" + version + ", pathData=" + pathData + "]";
	}

	
	//toString() //Alt+Shift +O,S
	
	
	
	
	/*
	 * public PersonInfo(int pid, String pname, float amt, String add, String
	 * osName, String version, String pathData) { super(); this.pid = pid;
	 * this.pname = pname; Amt = amt; Add = add; this.osName = osName; this.version
	 * = version; this.pathData = pathData; }
	 */
	
	

}
