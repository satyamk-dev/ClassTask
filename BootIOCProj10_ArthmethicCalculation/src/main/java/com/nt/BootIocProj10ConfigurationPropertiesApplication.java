package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Emp;

@SpringBootApplication
public class BootIocProj10ConfigurationPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(BootIocProj10ConfigurationPropertiesApplication.class, args);
		
		Emp es = ctx.getBean("eem" , Emp.class);
		
		String msg= es.toString();
		
		System.out.println(msg);
	}

}
