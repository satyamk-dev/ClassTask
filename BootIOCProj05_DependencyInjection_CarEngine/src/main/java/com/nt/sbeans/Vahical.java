package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vah")
public class Vahical {
	
	@Autowired
    @Qualifier("motor")
	private IEngine engg;
	
	public void jaranny(String start, String stop ){
		
		engg.startEngine();
		System.out.println("the start jaurnny form::::::::"+start);
		System.out.println("======================");
		System.out.println("the jaurnny stop :::::::"+stop);
		engg.stopEngine();
		
		
		
	}
	

}
