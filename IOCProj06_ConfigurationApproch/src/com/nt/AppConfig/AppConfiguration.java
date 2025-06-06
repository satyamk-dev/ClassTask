package com.nt.AppConfig;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages="com.nt.sbeans")
public class AppConfiguration {
	
	public AppConfiguration() {
		System.out.println("AppConfiguration.AppConfiguration()");
	}
	
	@Bean(name="ldate")
	public LocalDate createDate() {
		System.out.println("AppConfiguration.createDate()");
		return LocalDate.now();
	}
	

}
