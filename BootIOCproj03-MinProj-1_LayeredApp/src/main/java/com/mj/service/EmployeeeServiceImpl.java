package com.mj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mj.dao.IEmployeeDAO;
import com.mj.mode.Employee;

@Service("empService")


public class EmployeeeServiceImpl implements IEmployeeMgmtService {
	
	@Autowired
	@Qualifier("empDAOoracle")
	private IEmployeeDAO dao;

	@Override
	public List<Employee> techEmployeeByDesg(String desg1, String desg2, String desg3) throws Exception {
		
		// Conver the recived signature ti uppercase content
		
		
		desg1=desg1.toUpperCase();
		desg2=desg2.toUpperCase();
		desg3=desg3.toUpperCase();
		
		
		
		// Use DAO
		
		List<Employee> list=dao.getEmployeeDesgs(desg1, desg2, desg3);
		
		//list.sort((t1,t2)-> t1.getEmpno().compareTo(t2.getEmpno()));
		// Sorting the obj in the Collection
		
		list.sort((t1,t2)->t1.getEmpno().compareTo(t2.getEmpno()));
		
		// calculating gross salary and net salary
		
		list.forEach(emp->{
			emp.setGrossSalary(emp.getSalary()+(emp.getSalary()*0.5));
			emp.setNetSalary(emp.getGrossSalary()-(emp.getGrossSalary()*0.2));
		});
	
		
	return list;
}

	@Override
	public String registerEmployee(Employee emp) throws Exception 
	{
		int result=dao.insertEmployee(emp);
		
		return result==0?"Employee NOt Register":"Employee Register";       
		
		
		
	}

}
