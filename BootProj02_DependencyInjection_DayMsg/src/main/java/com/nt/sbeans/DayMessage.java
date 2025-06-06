package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dm")
public class DayMessage {
	
	@Autowired
	private LocalDateTime day;
	
	//create b.method
	public String DayMsg() {
		int time = day.getHour();
		
		if(time>=00 && time<12) {
			return "Good Morning";
		}
		else if(time>12 && time<=16) {
			return"Good AfterNoon"; 
		}
		else if(time>16 && time<20){
			return "Good Evening";
		}
		else {
			return "Good Night";
		}
	}

}
