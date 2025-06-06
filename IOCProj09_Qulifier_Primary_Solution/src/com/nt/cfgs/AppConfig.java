package com.nt.cfgs;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt.sbeans")
public class AppConfig {
	

	public AppConfig() {
		System.out.println("AppConfig.AppConfig()");
	}
	
	@Bean(name="ldate")
	public LocalDate createIDate() {
		System.out.println("AppConfig.createIDate()");
		return LocalDate.now();
	}
	
	@Bean(name="ldate1")
	public LocalDate createlDate1() {
		System.out.println("AppConfig.createlDate1()");
		return LocalDate.now();
	}
	
	@Bean(name="ldate2")
	public LocalDate createlDate2() {
	System.out.println("AppConfig.createlDate2()");
	return LocalDate.of(2020, 10, 20);
	}
	
	@Bean(name="ldate3")
	public LocalDate createlDate3() {
	System.out.println("AppConfig.createlDate3()");
	return LocalDate.of(2001,10,20);
	}
	
	@Bean
   public LocalTime createlTime() {
   System.out.println("AppConfig.createlTime()");
   return LocalTime.now();
   
        }
	
		
	}


