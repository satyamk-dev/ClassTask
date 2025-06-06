package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.DAO.Hospital;
import com.nt.Service.ServiceImpl;

@Controller("HosContro")
public class ControllerOp implements IController {

	@Autowired
	public ServiceImpl si;

	@Override
	public List<Hospital> HPController(String Hospital_Name) throws Exception {
		
		Hospital_Name = Hospital_Name.toUpperCase();
		
     List<Hospital> list = si.EBadService(Hospital_Name);
     
     return list;
	}

}
