package com.nt.service;
import java.util.List;
import com.nt.DAO.Hospital;
public interface IService {
	public List<Hospital> LogicalService(String Loc1, String Loc2, String Loc3)throws Exception;
}
