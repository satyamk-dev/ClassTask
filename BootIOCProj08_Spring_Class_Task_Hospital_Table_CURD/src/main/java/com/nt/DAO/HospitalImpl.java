package com.nt.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("hosRepo")
public class HospitalImpl implements IHospital {
	
	public static final String DB_SELECT_QUERY ="""
			    select Hno,hname,hloc,state,Bad_Ccity,Owner from State_hospital
			""";
	public static final String DB_INSERT_QUERY ="""
		    insert into State_hospital(Hno,hname,hloc,state,Bad_Ccity,Owner  
		    values(?,?,?,?,?,?);
		""";
	
	public static final String DB_UPDATE_QUERY ="""
		    update state_hospital
		    se
		""";
	
	

	@Override
	public List<Hospital> InsertHospitalData(Hospital hos) throws Exception {
		
		
		
		
		return null;
	}

}
