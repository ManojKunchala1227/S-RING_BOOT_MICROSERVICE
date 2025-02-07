package com.mj.service;

import java.util.List;

import com.mj.entity.Employee;

public interface IEmployeeService 
{
	public List<Employee> findAll();
	public String registerEmp(Employee emp);
	public String editEmp(Employee emp);
	public Employee fetchById(Integer id);
	public String deleteEmp(int id);

}