package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.DAO.Employee;
import com.nt.service.EmployeeService;

@Controller("empConto")
public class EController implements IController {
	
	@Autowired
	private EmployeeService ec;

	@Override
	public String EmployeeController(Employee emp) throws Exception {
		
		String resultMsg = ec.registerEmployee(emp);
		
		return resultMsg;
				
	
		
		
	}

}
