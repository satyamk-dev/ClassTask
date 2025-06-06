package com.nt.ston;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("prn1")
@Scope("prototype")
public class Printer {
	
	
public static Printer printer;

	public Printer() {
      System.out.println("Printer.Printer()::0 param constructor");
	}
	
	public static Printer getInstance() {
		if(printer==null) 
			printer=new Printer();
		  return printer;
		
	}
	
	

}
