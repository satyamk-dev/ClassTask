package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Component("wdf")
public class WeekDayFinder {
	
	@Autowired
	@Qualifier("ldate")
	private LocalDate date;
	
	@Autowired
	private LocalTime time;
	
	@Autowired
	public WeekDayFinder(@Qualifier("ldate3")LocalDate date, LocalTime time) {
		this.date=date;
		this.time=time;
	}

	@Autowired
	@Qualifier("ldate1")
	public void setDate(LocalDate date) {
		System.out.println("DateAndTime.setDate()");
		this.date = date;
	}
	
	@Autowired
	@Qualifier("ldate3")
	public void putDate(LocalDate date) {
		System.out.println("DateAndTime.putDate()");
		this.date=date;
	}

	@Autowired 
	public void setTime(LocalTime time) {
		System.out.println("DateAndTime.setTime()");
		this.time = time;
	}
	
	@Autowired
	public void assignTime(LocalTime time) {
		System.out.println("DateAndTime.assignTime()");
		this.time=time;
	}
	
	public String weekDayFinder() {
		int day =date.getDayOfWeek().getValue();
		if(day>=1&&day<=5) {
			return"work day";
		}else {
			return"weekend";
		}
		
		
	}
	
}
