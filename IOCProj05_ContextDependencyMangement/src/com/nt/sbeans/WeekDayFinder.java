package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("sf")
public class WeekDayFinder {
	
	private LocalDate date;
	
	public WeekDayFinder() {
		System.out.println("WeekDayFinder.WeekDayFinder()");
		
	}
	
	@Autowired
	public void setDate(LocalDate date) {
		System.out.println("WeekDayFinder.setDate()");
		
		this.date= date;
	}
	
	public String WeekDayFinderMethod(String user) {
		int day  = date.getDayOfWeek().getValue();
		
		System.out.println("result:\t"+day);
		
		if(day>=1 && day<=5) {
			return "Work Day";
		}
		else {
			return "holiDay";
		}
	}

}
