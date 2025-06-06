package com.nt.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.DAO.Hospital;
import com.nt.DAO.HospitalImpl;

@Service("HosService")
public class ServiceImpl implements IService {

	@Autowired
	private HospitalImpl dao;
	
	@Override
	public List<Hospital> EBadService(String Hospital_Name) throws Exception {
		
		
		Hospital_Name = Hospital_Name.toUpperCase();
		
		List<Hospital> list = dao.fatchHospitalTable(Hospital_Name);
		
		for(Hospital hos: list){
			
			int current_Bad =hos.getCbad();
			int total_Bad =hos.getTbad();
			int empty_Bad = total_Bad- current_Bad;
			hos.setEmptyBad(empty_Bad);
			
		}
		return list;
		
		
		
	}

}
