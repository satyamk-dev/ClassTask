package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("sf")
public class SessionFinder {
	
	private LocalDate date;
	
	public void SessionFinder() {
		System.out.println("SessionFinder.SessionFinder()");
	}

	@Autowired
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	public String SessionFinderM() {
		
		int month = date.getMonthValue();
		
		if(month>=3 && month<=6) {
			return "Summer Session";
				}
		
		else if(month>=7 && month<=10) 	{
			return "Rainy Session";
		}
		else {
			return "Winter Session";
		}
	}
	

}
