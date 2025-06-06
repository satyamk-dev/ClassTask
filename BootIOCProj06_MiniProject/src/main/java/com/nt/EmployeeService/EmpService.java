package com.nt.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.DAO.Employee;
import com.nt.DAO.IEmployeeDAO;

@Service("empService")
public class EmpService implements IEmpService {
	
	@Autowired
	private IEmployeeDAO dao;// DAO impl class obj injection Injected

	@Override
	public List<Employee> fatchEmplyeeData(String desg1, String desg2, String desg3) throws Exception {
		
		desg1 = desg1.toUpperCase();
		desg2 = desg2.toUpperCase();
		desg3 = desg3.toUpperCase();
		
		List<Employee> list = dao.getEmployeeByDesgs(desg1, desg2, desg3);

		for(Employee emp: list) {
		double salary = emp.getSal();
		
		double Hra= salary*0.20;
		double da = salary*0.10;
		double pf =salary*0.12;
		double tax =salary*0.05;
		
		emp.setGrossSalary(emp.getSal()+Hra+da);
		emp.setNetSalary(emp.getGrossSalary()-(pf+tax));
		
		}
		return list;
	}

}
