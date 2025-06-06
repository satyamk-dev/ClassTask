package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.DAO.Hospital;
import com.nt.DAO.HospitalDAO;

@Service("hosService")
public class HospitalService implements IService {
	
	@Autowired
	private HospitalDAO dao;

	@Override
	public List<Hospital> LogicalService(String Loc1, String Loc2, String Loc3) throws Exception {
		return dao.FatchHospital(Loc1, Loc2, Loc3);
	}

}
