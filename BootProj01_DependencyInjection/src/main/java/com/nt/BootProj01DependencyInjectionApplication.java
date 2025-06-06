package com.nt;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.SessionFinder;

@SpringBootApplication
public class BootProj01DependencyInjectionApplication {
	
	@Bean(name="idt")
	public LocalDate createDate() {
		return LocalDate.now();
	}

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj01DependencyInjectionApplication.class, args);
      
		SessionFinder sf= ctx.getBean("sfs",SessionFinder.class);
		
		String msg = sf.FindSession();
		
		System.out.println(msg);
		
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
