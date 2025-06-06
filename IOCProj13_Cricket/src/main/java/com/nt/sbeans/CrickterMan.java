package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("cMan")
public final class CrickterMan {
	
	@Autowired
	@Qualifier("bas")
	private Bat bat;	

	public CrickterMan() {
   System.out.println("CrickterMan.CrickterMan()");
   
	}
	
	public void player(String name) {
		System.out.println("This is player method");
		
		
		
		System.out.println("Cricker are playing and Cricker name is "+name);
		
		bat.batting();
	}
	
	

}
