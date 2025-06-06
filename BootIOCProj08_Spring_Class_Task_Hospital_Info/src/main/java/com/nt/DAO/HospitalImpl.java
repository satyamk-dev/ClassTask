package com.nt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.nt.BootIocProj08SpringClassTaskHospitalInfoApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("HosRepo")
public class HospitalImpl implements IHospital {

    private final BootIocProj08SpringClassTaskHospitalInfoApplication bootIocProj08SpringClassTaskHospitalInfoApplication;
	
	@Autowired
	private DataSource ds;
	
	public static final String DB_SELECT_QUERY="""
																						SELECT HNO,HNAME,HLOC,CURR_BAD,TOTAL_BAD FROM HOSPITAL
																						WHERE UPPER(HNAME) =?
																							""";

    HospitalImpl(BootIocProj08SpringClassTaskHospitalInfoApplication bootIocProj08SpringClassTaskHospitalInfoApplication) {
        this.bootIocProj08SpringClassTaskHospitalInfoApplication = bootIocProj08SpringClassTaskHospitalInfoApplication;
    }

	@Override
	public List<Hospital> fatchHospitalTable(String Hospital_Name) throws Exception {
		List<Hospital> list= null;
		try(
				Connection con =ds.getConnection();
				PreparedStatement ps = con.prepareStatement(DB_SELECT_QUERY);
				){
			Hospital_Name = Hospital_Name.toUpperCase();
			System.out.println(Hospital_Name);
			
			ps.setString(1, Hospital_Name);
			    
			   try(
					   ResultSet rs = ps.executeQuery();
					   ){
				   list= new ArrayList();
				   while(rs.next()) {
					   
					   
				   Hospital hos= new Hospital();
				   
				   hos.setNo(rs.getInt(1));
				   hos.setName(rs.getString(2));
				   hos.setLocation(rs.getString(3));
				   hos.setCbad(rs.getInt(4));
				   hos.setTbad(rs.getInt(5));
				   
				   list.add(hos);
				   
				   }
				   
			   }catch(SQLException e) {
				   e.printStackTrace();
				   System.err.println("Error from ResultSet ");
			   }
			
			
			
			
		}catch(SQLException se) {
			throw se;
		}
		
		
		
		
		
		return list ;
	}

}
