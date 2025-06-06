package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sfs")
public class SessionFinder {
	
	@Autowired
	private LocalDate date;
	
	
	public String FindSession() {
		
		int month = date.getMonthValue();
		
		if(month>=3 && month<=6) {
			return "Summer session";
		}
		else if(month>=7 && month <=10) {
			return "Rainy Session";
		}
		else {
			return "Winter Session";
		}
		
		
	}

}
