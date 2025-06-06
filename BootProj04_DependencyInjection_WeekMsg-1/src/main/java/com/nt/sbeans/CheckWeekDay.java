package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cwd")
public class CheckWeekDay {
	
	@Autowired
	private LocalDate day;
	
	public String CheckDay() {
		int d = day.getDayOfWeek().getValue();
		
		if(d>=1 || d<=5) {
			return "Today no WeekEnd So Focus On Your Tasks 🤕🤑🥳";
		}else {
			return"Today is WeekDay So Enjoy Your WeekEnd 🥳🥳🥳";
		}
	}

}
