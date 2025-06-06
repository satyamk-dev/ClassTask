package com.nt.DAO;

import java.util.List;

public interface IHospital {
	
	public List<Hospital> FatchHospital(String Loc1, String Loc2, String Loc3)throws Exception;

}
