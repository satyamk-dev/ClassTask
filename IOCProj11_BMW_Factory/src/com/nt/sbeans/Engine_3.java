package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Lazy(true)
@Component("E3")
public class Engine_3 implements Engine {
	
	
	
	public Engine_3() {
     System.out.println("Engine_3.Engine_3()");
	}

	@Override
	public String deliver(int oid) {
		return"Engine_3 are use "+oid+" Engine Order Number";
	}

}
