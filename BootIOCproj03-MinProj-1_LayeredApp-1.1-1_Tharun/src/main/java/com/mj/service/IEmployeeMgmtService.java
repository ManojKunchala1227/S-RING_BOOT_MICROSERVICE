package com.mj.service;

import java.util.List;

import com.mj.mode.Employee;

public interface IEmployeeMgmtService {
	public List<Employee>fethEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception;

}
