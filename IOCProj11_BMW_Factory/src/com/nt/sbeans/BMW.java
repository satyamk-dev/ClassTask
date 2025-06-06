package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bmw")
public final class BMW {
	
	@Autowired	
	@Qualifier("E1")
     private Engine engine;

	public BMW() {
	System.out.println("BMW.BMW()");
	}
	
	
	public String BuyEngine(String eengine[] , Double[] price) {
		
		double bill = 0;
		
		for(double p: price) {
			bill= bill+p;
		}
		
		int oid = new Random().nextInt(10000);
		
		String msg = engine.deliver(oid);
		
		return Arrays.toString(eengine)+"are bought Engine for BMW car"+bill+"\s====>"+msg;
		
	}
	
}