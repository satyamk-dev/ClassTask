package com.nt.AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.nt.ston.Printer;

public class AppConfiguration {
	
	@Bean(name="prn1")
	@Scope("prototype")
	public Printer createPrinter() {
		return new Printer();
	}
	
	@Bean(name="prn2")
	@Scope("prototype")
	public Printer createPrinter1() {
		return Printer.getInstance();
	}

}
