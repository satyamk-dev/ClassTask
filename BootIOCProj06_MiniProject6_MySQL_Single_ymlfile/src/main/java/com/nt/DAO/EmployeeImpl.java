package com.nt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository("empOracle")
@Profile({"sql","default"})
public class EmployeeImpl implements IEmployeeDAO {

	@Autowired
	private DataSource ds;  //The IOC Container injects HikariDataSource
														//obj that come through AutoConfiguration
	
	//This is SQL Query to injecting dynamic value in sql query 
	private static final String DB_EMP_SELECT ="""
																								SELECT EMPID, ENAME,JOB,SAL,DEPTNO FROM EMPLOYEE
																								WHERE ENAME IN(?)
																						   	""";
	
	
	// I override IEmployeeDAO GetEmployeeByDesgs method and return List <Employee> Employee is setter and getter 
		
				@Override
				public List<Employee> getEmployeeByDesgs(String name) throws Exception {
					List<Employee> list =null ;
					System.out.println("I'm SQL");
					
					try(
							Connection con =ds.getConnection();
							PreparedStatement ps =con.prepareStatement(DB_EMP_SELECT);
							){
						
						name = name.toUpperCase();	
						ps.setString(1,name);
								 try(
										 ResultSet rs= ps.executeQuery();
										 ){
									 
									 list=new ArrayList<>();
									 
									 while(rs.next()) {
										 
										 
									 
									 Employee emp =new Employee();
										emp.setEmpid(rs.getInt(1));
									   emp.setSname(rs.getString(2));
									 emp.setJob(rs.getString(3));
									 emp.setSal(rs.getDouble(4));
									 emp.setDeptno(rs.getInt(5));

									
									list.add(emp);
									 
									 }	 
									 
								 }catch(SQLException e) {
									 throw e;
								 }
						
					}catch(SQLException se) {
						throw se;
					}
					
					
					
					
					return list;
				}
	
}//class Close
