package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("mshop")

public final class MobileShop {
	
	@Autowired
	@Qualifier("mi")
	private Mobile mobile;
	
	public void Shop(String country) {
		
		System.out.println("Tranding mobile Country name:\t"+ country);
		mobile.Tranding();
		
	}
	
	
	
	

}
