package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy(true)
@Component("oppo")
public final class Oppo implements Mobile {
	
	public void Tranding() {
		System.out.println("Oppo Is Tranding Now 🎇📱🎆");
		
	}

}
