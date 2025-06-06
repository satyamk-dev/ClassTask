package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Vahical;

@SpringBootApplication
@ImportResource("com/nt/cfgs/ApplicationContext.xml")
public class BootIocProj05DependencyInjectionCarEngineApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(BootIocProj05DependencyInjectionCarEngineApplication.class, args);
		
		Vahical vhi = ctx.getBean("vah",Vahical.class);
		
		 vhi.jaranny("goa", "mum");
		 
		 ((ConfigurableApplicationContext) ctx).close();
	}

}
