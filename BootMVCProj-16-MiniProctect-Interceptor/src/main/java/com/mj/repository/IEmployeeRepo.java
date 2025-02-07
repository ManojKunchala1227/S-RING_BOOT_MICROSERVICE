package com.mj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mj.entity.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer> 
{

}