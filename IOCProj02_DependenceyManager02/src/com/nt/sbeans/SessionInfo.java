package com.nt.sbeans;

import java.time.LocalDate;
import java.time.Month;
public class SessionInfo {
	
	private LocalDate date;
	
	//Created no  @param constructor
	public SessionInfo() {
		System.out.println("SessionInfo :: 0  - param constructor");
	}

	//setter method 
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	//logic method
	public String SessionMessage(String user) {
		int mv = date.getMonthValue();
		
		if(mv<8) {
			return "\s\sBro Summer Session\t:\t"+user;
		}
		else if(mv<12) {
			return "\s\sBro Rainy Session\t:\t:"+user;
		}
		else {
			return"\s\sBro Winter Session\t:\t:"+user;
		}
		
		
	}
	
	
	
	

}
