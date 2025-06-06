package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("wdf")
//@Scope("singleton")
//@Scope("prototype")
public class WeekDayFinder {
	
	@Autowired
	private LocalDate date;
	
	public WeekDayFinder() {
		System.out.println("WeekDayFinder.WeekDayFinder()");
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public String WeekDayFinderMethod(String user) {
		int day = date.getDayOfWeek().getValue();
		
		if(day>=1 && day<=5) {
			return "Today Working Day"+user;
		}
		else {
			return"Today Weekend Enjoy your WeekEnd"+user;
		}
	}
	
	

}
