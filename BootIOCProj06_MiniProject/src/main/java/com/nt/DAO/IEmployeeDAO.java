package com.nt.DAO;

import java.util.List;

public interface IEmployeeDAO {

	public List<Employee> getEmployeeByDesgs(String desg1, String desg2, String desg3)throws Exception;

	
}
