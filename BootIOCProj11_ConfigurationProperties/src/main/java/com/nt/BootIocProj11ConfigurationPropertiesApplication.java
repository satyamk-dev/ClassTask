package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Hotel;

@SpringBootApplication
public class BootIocProj11ConfigurationPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(BootIocProj11ConfigurationPropertiesApplication.class, args);
		
		Hotel hh= ctx.getBean("hot",Hotel.class);
		
		String msg=hh.toString();
		
		System.out.println(msg);
		
		((ConfigurableApplicationContext) ctx).close();
}

}
