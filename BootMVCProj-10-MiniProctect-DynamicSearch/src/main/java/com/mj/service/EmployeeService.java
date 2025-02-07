package com.mj.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.mj.entity.Employee;
import com.mj.repository.IEmployeeRepo;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private IEmployeeRepo repo;
	@Override
	public List<Employee> findAll() {
		
		
		List<Employee> list=StreamSupport.stream(repo.findAll().spliterator(), false).toList();
		
		return list.stream().sorted((emp1,emp2)->emp1.getName().compareTo(emp2.getName())).toList();
	}
//==============================================================
	@Override
	public String registerEmp(Employee emp) {
		int empid=repo.save(emp).getId();
		return "Employee is registered Successfuly : "+empid;
	}
	//==============================================================
	
	@Override
	public Employee fetchById(Integer id) {
		
		return repo.findById(id).orElseThrow(()-> new IllegalArgumentException());
	}
	//==============================================================	
	
	
	  @Override public String editEmp(Employee emp) {
	  Optional<Employee> it=repo.findById(emp.getId());
	  
	  if(it.isPresent())
	  {
		  repo.save(emp);
		  return emp.getId()+" Employee is Updated";
	  }
	  
	  return emp.getId()+ "Employee is not found";
			  }
	 
	
	
	//==============================================================
	@Override
	public String deleteEmp(int id)
	{
		Optional<Employee> opt=repo.findById(id);
		
		if(opt.isPresent())
		{
			repo.deleteById(id);
			return id+ "Employee Deleted Successfuly....";
		}
		
		return id+ "Employee is not found for deletion";
	}
	
	//==============================================================
	@Override
	public List<Employee> showEmployeeReportWithDynamicSearch(Employee emp) {
		
		if(emp.getName().equalsIgnoreCase("") || emp.getName().length()==0)
			emp.setName(null);
		if(emp.getRole().equalsIgnoreCase("") || emp.getRole().length()==0)
			emp.setRole(null);
		
		
		Example ex=Example.of(emp);
		
		List<Employee> list =repo.findAll(ex);
		return list;
	}
	

}
