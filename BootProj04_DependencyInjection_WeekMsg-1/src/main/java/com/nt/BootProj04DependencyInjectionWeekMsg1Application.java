package com.nt;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.CheckWeekDay;

@SpringBootApplication
public class BootProj04DependencyInjectionWeekMsg1Application {
	
	@Bean(name="sd")
	public LocalDate createDay() {
		return LocalDate.now();
	}

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(BootProj04DependencyInjectionWeekMsg1Application.class, args);
		
		CheckWeekDay cd= ctx.getBean("cwd", CheckWeekDay.class);
		
		String msg = cd.CheckDay();
		
		System.out.println(msg);
	}

}
