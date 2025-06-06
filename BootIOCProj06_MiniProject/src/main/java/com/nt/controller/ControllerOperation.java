package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.DAO.Employee;
import com.nt.EmployeeService.IEmpService;

@Controller("contro")
public class ControllerOperation {
	
	@Autowired
	private IEmpService es;
	
	public List<Employee>  showAllEmployeeByDesg(String desg1, String desg2, String desg3)throws Exception{

		List<Employee> list = es.fatchEmplyeeData(desg1, desg2, desg3);
		
		return list;
		
	}

}
