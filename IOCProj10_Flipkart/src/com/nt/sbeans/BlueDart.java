package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("bDart")
@Lazy(true)
public final class BlueDart implements ICourier {

	public BlueDart() {
		System.out.println("BlueDart.BlueDart():: 0 param constructor");
	}

	@Override
	public String deliver(int oid) {
		
		return "BlueDart Ready for deliver "+oid+" Product order number";
	}
	
	
	
	

}
