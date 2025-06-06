package com.nt.sbeans;

import java.time.LocalDate;

import com.nt.BootProj03DependencyInjectionWeekMsgApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WeekMessage {

    private final BootProj03DependencyInjectionWeekMsgApplication bootProj03DependencyInjectionWeekMsgApplication;
	
	@Autowired
	private LocalDate day;

    WeekMessage(BootProj03DependencyInjectionWeekMsgApplication bootProj03DependencyInjectionWeekMsgApplication) {
        this.bootProj03DependencyInjectionWeekMsgApplication = bootProj03DependencyInjectionWeekMsgApplication;
    }
	
	public void WeekMsg() {
		
	String d = day.getDayOfWeek().toString();
	
	System.out.println(d);
		
		
		
		
	}

	
	
}
