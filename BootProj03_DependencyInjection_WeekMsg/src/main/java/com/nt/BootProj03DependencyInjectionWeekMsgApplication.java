package com.nt;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.WeekMessage;

@SpringBootApplication
public class BootProj03DependencyInjectionWeekMsgApplication {
	
	@Bean(name="ldw")
	public LocalDate createDay() {
		return LocalDate.now();
	}

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj03DependencyInjectionWeekMsgApplication.class, args);
		
		WeekMessage wm =ctx.getBean("wmg",WeekMessage.class);
		
		wm.WeekMsg();
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
