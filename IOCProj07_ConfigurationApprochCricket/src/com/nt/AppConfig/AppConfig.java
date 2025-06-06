package com.nt.AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt.sbeans")
public class AppConfig {

	public AppConfig() {
	System.out.println("AppConfig.AppConfig()");
	}
	
	@Bean(name="runs")
   public int createRuns() {
	   System.out.println("AppConfig.createRuns()");
	   int runs = (int)(Math.random()*100);
	   return runs;
   }
	
	
	
	

}
