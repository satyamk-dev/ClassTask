package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dtdc")
@Lazy(true)
public final class DTDC implements ICourier {
	
	public DTDC() {
		System.out.println("0-param constructor DTDC");
	}

	@Override
	public String deliver(int oid) {
		return "DTDC is ready to delivery "+oid+" Order number Product";
	
	}

	
	
	

}
