package com.nt.sbeans;
import java.time.LocalTime;

public class WishMessageGenerator {
	private LocalTime time;

	//No @param constructor WishMessageGenerator
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator ::-:: 0 param constructor");
	}
	
	//This is Setter method for set Time
	public void setTime(LocalTime time) {
		this.time = time;
	}
	
	//B.Method  logic 
	public String WishMessage(String user) {
		System.out.println("WishMessageGenerator.WishMessage()");
		
	int hour = time.getHour();
	
	if(hour<12) {
		return "Good Morning\t\t:"+user;
	}
	else if(hour<16) {
		return "Good AfterNoon\t\t:"+user;
	}
	else if(hour<20) {
		return "Good Evening\t\t:"+user;
	}
	else {
		return "Good Night\t\t:"+user;
	}
	}
}
