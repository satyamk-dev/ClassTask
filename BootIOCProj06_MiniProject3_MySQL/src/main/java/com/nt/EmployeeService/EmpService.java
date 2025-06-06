package com.nt.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.DAO.Employee;
import com.nt.DAO.IEmployeeDAO;

@Service("empService")
public class EmpService implements IEmpService {
	
	@Autowired
	@Qualifier("daoDB")// here allow qualifier
	private IEmployeeDAO dao;// DAO impl class obj injection Injected

	@Override
	public List<Employee> fatchEmplyeeData(String name) throws Exception {
	return dao.getEmployeeByDesgs(name);
		
	}
}
