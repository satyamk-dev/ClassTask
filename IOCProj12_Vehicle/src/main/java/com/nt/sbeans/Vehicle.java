package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle  {
	
	@Autowired
	@Qualifier("dEngine")
	private IEngine engine;

	public Vehicle() {
		System.out.println("Vehicle.Vehicle():::::::::::::::non param constructor");
	}
	
	
	public void journey(String place, String dest) {
		
		System.out.println("Vehicle.journey()::::::::::::::::;This journey method ");
		
		System.out.println("start Place \t:"+place+"Stop Destination \t:"+ dest);
		
		System.out.println("==---------------Car running-------------------==");
		
		engine.startEngine();
		
		System.out.println("======------------Car Stop----------======");
		
		engine.stopEngine();
		
		
		
		
	}
	
	
	
	
	
	

	

}
