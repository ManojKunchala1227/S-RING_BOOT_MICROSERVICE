package com.mj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mj.mode.Employee;

@Repository("dao")
public class EmployeeDAO implements IEmployeeDAO 
{
	
	
	private static final String GET_EMP_BY_DESG="SELECT ID,NAME,ROLE,SALARY FROM EMP WHERE ROLE IN (?,?,?)";
	
	@Autowired
	private DataSource ds; 
	
	@Override
	public List<Employee> getEmployeeDesg(String desg1, String desg2, String desg3) throws Exception
	{
		List<Employee> list=null;
		
		try(Connection con=ds.getConnection();
			PreparedStatement ps=con.prepareStatement(GET_EMP_BY_DESG))
		{
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			
			try(ResultSet rs=ps.executeQuery();)
			{
				list = new ArrayList();
				while(rs.next())
				{
					Employee emp= new Employee();
					emp.setEmpno(rs.getInt(1));
					emp.setName(rs.getString(2));
					emp.setJob(rs.getString(3));
					emp.setSalary(rs.getDouble(4));
					list.add(emp);
					
					
					
					
					
					
				}
			}
			catch(SQLException se)
			{
				System.out.println("somw DB Proble, Wait foe Some time");
				
			}
			catch(Exception e)
			{
				System.out.println("some unknown problem wait for few menits");
			}
			
			
			
		}
		
		
		
		
		return list;
	}

}
