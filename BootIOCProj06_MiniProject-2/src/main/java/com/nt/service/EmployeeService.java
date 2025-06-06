package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.DAO.Employee;
import com.nt.DAO.IEmployeeImpl;

@Service("empService")
public class EmployeeService implements IEmployeeServiec {
	
	@Autowired
	  private IEmployeeImpl dao;

	@Override
	public String registerEmployee(Employee emp) throws Exception {
		
		int result= dao.InsertEmployeeData(emp);
		
		return (result==0)? "Employee Not Resistered":"Employee are Registered";
	}

}
