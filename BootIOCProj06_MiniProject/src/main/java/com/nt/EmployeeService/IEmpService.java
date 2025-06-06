package com.nt.EmployeeService;

import java.util.List;

import com.nt.DAO.Employee;

public interface IEmpService {
	
	public List<Employee> fatchEmplyeeData(String desg1, String desg2, String desg3)throws Exception;

}
