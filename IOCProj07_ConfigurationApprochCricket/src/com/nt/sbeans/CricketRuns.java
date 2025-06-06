package com.nt.sbeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Cr")
public class CricketRuns {
	
	
	@Autowired
	private int runs;
	
public  CricketRuns() {
		System.out.println("CricketRuns.CricketRuns()");
	}
	
	public String RunChecker(String Cricketer) {
		
		if(runs<=0) {
			return"NO Runs"+Cricketer;
		}
		
		else if(runs>=50) {
			return"half Cenchuri Completed"+Cricketer;
		}
		
		else if(runs>=100) {
			return "Cenchuri Completed"+Cricketer;
		}
		
		else {
			return "Total : " + runs;
		}
		
		
	}
	
	
	
	
	
	

}
