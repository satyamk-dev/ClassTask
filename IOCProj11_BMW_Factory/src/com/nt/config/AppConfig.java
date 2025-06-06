package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt.sbeans")
public final class AppConfig {

	public AppConfig() {
		System.out.println("no beans this is AppConfig Class");
	}
	
	

}
