
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

@Repository("empDAOoracle")
public class EmployeeDAOImplOracle implements IEmployeeDAO {
	
	private static String GET_EMPS_BY_DESG="SELECT ID,NAME,ROLE,SALARY FROM EMP WHERE ROLE IN(?,?,?)";
	private static final String INSERT_EMP="INSERT INTO EMP(ID,NAME,ROLE,SALARY) VALUES(ID_SEQ1.NEXTVAL,?,?,?)"; //CREATE SEQUENCE ID_SEQ1 
	@Autowired
	private DataSource ds;
	
	
	
	@Override
	public List<Employee> getEmployeeDesgs(String desg1, String desg2, String desg3) throws Exception 
	{
	List<Employee> list=new ArrayList();
		try(Connection con=ds.getConnection();
			//create PreparedStatem obj having the pre-coppiled SQL Query
			PreparedStatement ps=con.prepareStatement(GET_EMPS_BY_DESG);)
		
		{
			// set values to query params
						ps.setString(1, desg1);
						ps.setString(2, desg2);
						ps.setString(3, desg3);
					try(ResultSet rs=ps.executeQuery();)
					{
						// process the Result set Object
						System.out.println(rs);
						
						while(rs.next())
						{
							// copy each record into java bean class object
							 
							Employee emp= new Employee();
							emp.setEmpno(rs.getInt(1));
							emp.setName(rs.getString(2));
							emp.setJob(rs.getString(3));
							emp.setSalary(rs.getDouble(4));
							// add each java bean obj to list connection
							
							list.add(emp);
							
						}// End of While loop
						
					}//try2
			
		}//try1
		catch(SQLException se)
		{
			System.out.println("somw DB Proble, Wait foe Some time");
			
		}
		catch(Exception e)
		{
			System.out.println("some unknow problem wait for some time"); 
			throw e;
			
		}
		
		return list;
	}



	@Override
	public int insertEmployee(Employee emp)throws Exception {
	int	result=0;
		try(Connection con=ds.getConnection();
				//create PreparedStatem obj having the pre-coppiled SQL Query
				PreparedStatement ps=con.prepareStatement(INSERT_EMP);)
			
			{
				// set values to query params
							ps.setString(1, emp.getName());
							ps.setString(2,emp.getJob());
							ps.setDouble(3, emp.getSalary());
							
							 result=ps.executeUpdate();
				
			}//try1
			catch(SQLException se)
			{
				System.out.println("SQL Insert {roblem");

				throw se;
			}
			
		
		return result;
	}

}
