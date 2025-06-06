package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component("E1")
public final class Engine_1 implements Engine{
	
	

	public Engine_1() {
       System.out.println("Engine_1.Engine_1()");
	}

	@Override
	public String deliver(int oid) {
		 return "Engine_1 are use "+oid+" Engine Order number ";
	}
	
	

}
