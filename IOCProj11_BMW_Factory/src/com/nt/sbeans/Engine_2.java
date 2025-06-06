package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Lazy(true)
@Component("E2")
public class Engine_2 implements Engine {
	
	

	public Engine_2() {
		System.out.println("Engine_2.Engine_2()");
	}

	@Override
	public String deliver(int oid) {
	return "Engine 2 are use "+oid+"Engine order number";
	}

}
