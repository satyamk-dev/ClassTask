package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import com.nt.DAO.Employee;
import com.nt.EmployeeService.IEmpService;

@Controller("contro")
public class ControllerOperation {
	
	@Autowired
	private IEmpService es;
	
	public List<Employee>  showAllEmployeeByDesg(String name)throws Exception{

		return es.fatchEmplyeeData(name);
	}

}
