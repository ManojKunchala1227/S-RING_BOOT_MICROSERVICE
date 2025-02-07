package com.mj.dao;

import java.util.List;

import com.mj.mode.Employee;

public interface IEmployeeDAO
{
	public List<Employee> getEmployeeDesg(String desg1,String desg2,String desg3) throws Exception;

}
