package com.nt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("empRepo")
public class IEmployeeImpl implements IEmployeeDAO{
	
	@Autowired
	private DataSource ds;
	
	public static final String DB_INSERT_QUERY="""
																		insert into company(sno,ename,job,sal)
																		values(SEQ1.NEXTVAL,?,?,?)
																		
																		""";
			

	@Override
	public int InsertEmployeeData(Employee emp) throws Exception {
		int result = 0;	
		
		try(
				Connection con=ds.getConnection();
				PreparedStatement ps = con.prepareStatement(DB_INSERT_QUERY);
				
				){
					
			ps.setString(1,emp.getName());
			ps.setString(2, emp.getJob());
			ps.setDouble(3, emp.getSalary());
			
			result = ps.executeUpdate();
			
			
		}catch(SQLException se) {
			throw se;
			
		}
		return result;
	
	}
}
