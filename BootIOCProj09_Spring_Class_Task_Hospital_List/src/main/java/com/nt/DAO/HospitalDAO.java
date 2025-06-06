package com.nt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("hosRepo")
public class HospitalDAO implements IHospital {
	
	public static final String DB_FATCH_HOSPITAL ="""
			
		SELECT HNO, HNAME, HLOC, STATE, BAD_CCITY, OWNER
				FROM STATE_HOSPITAL
					WHERE UPPER(STATE) IN (?, ?, ?)
							ORDER BY STATE
			""";
	
	@Autowired
	private DataSource ds;
	
	@Override
	public List<Hospital> FatchHospital(String Loc1, String Loc2, String Loc3) throws Exception {
		List<Hospital> list= new ArrayList<>();
		try(
				Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(DB_FATCH_HOSPITAL);
				){
			
			Loc1 = Loc1.toUpperCase();
			Loc2= Loc2.toUpperCase();
			Loc3 = Loc3.toUpperCase();
			
			ps.setString(1, Loc1);
			ps.setString(2,Loc2);
			ps.setString(3, Loc3);
			try(
					ResultSet rs  = ps.executeQuery();
					){
				while(rs.next()){
					Hospital hos = new Hospital();
				hos.setHno(rs.getInt("HNO"));
				hos.setHname(rs.getString("HNAME"));
				hos.setHloc(rs.getString("HLOC"));
				hos.setState(rs.getString("STATE"));
				hos.setBad_ccity(rs.getInt("BAD_CCITY"));
				hos.setOwner(rs.getString("OWNER"));
				list.add(hos);
				}
			}catch(SQLException e) {
				System.err.println("This error from ResultSet site check once");
				e.printStackTrace();
			}
		}catch(SQLException se) {
			System.err.println("This error from Connention Side Check once");
			throw se;
		}
		return list;
	}
}
