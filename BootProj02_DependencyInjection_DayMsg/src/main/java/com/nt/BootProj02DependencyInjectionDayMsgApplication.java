package com.nt;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.DayMessage;

@SpringBootApplication
public class BootProj02DependencyInjectionDayMsgApplication {
	
	@Bean(name="ldt")
	public LocalDateTime createTime() {
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(BootProj02DependencyInjectionDayMsgApplication.class, args);
		
		DayMessage dmsg= ctx.getBean("dm",DayMessage.class);
		
		String msg = dmsg.DayMsg();
		
		System.out.println(msg);
		
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
