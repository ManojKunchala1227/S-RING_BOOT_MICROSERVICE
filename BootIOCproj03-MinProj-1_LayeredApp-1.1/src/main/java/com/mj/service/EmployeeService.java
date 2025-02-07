package com.mj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mj.dao.IEmployeeDAO;
import com.mj.mode.Employee;
@Service("service")
public class EmployeeService implements IEmployeeService {

	@Autowired
	private IEmployeeDAO IEDAO;
	@Override
	public List<Employee> fechServiceByDesg(String desg1, String desg2, String desg3) throws Exception 
	{
		desg1=desg1.toUpperCase();
		desg2=desg2.toUpperCase();
		desg3=desg3.toUpperCase();
		
		
		//USe DAO
		
		List<Employee> list=IEDAO.getEmployeeDesg(desg1, desg2, desg3);
		
		list.sort((t1,t2)->t1.getEmpno().compareTo(t2.getEmpno()));
		
		
		
		
		
		
		return list;
	}

}
