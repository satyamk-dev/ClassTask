package com.nt.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.DAO.Hospital;
import com.nt.service.HospitalService;

@Controller("hosContro")
public class HospitalController {
	
	@Autowired
	private HospitalService hs;
	
	
	public List<Hospital> HosCotroller(String Loc1, String Loc2, String Loc3)throws Exception{
		return  hs.LogicalService(Loc1, Loc2, Loc3);
	}

}
