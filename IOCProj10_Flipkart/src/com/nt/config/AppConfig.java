package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages="com.nt.sbeans")
public class AppConfig {
  
	public AppConfig() {
        System.out.println("This is AppConfig 0 param contructor");
        System.out.println("no any bean method");
	}
	
	
	
	

}
