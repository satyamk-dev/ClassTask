package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.DAO.Employee;
import com.nt.controller.ControllerOperation;

@SpringBootApplication
//@Qualifier("empOracle") // not allow
@ImportResource("com/nt/cfgs/ApplicationContext.xml")
public class BootIocProj06MiniProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(BootIocProj06MiniProjectApplication.class, args);
		
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter Your Name\t:::::");
	
	String n = sc.next();
		
		try {
			ControllerOperation co=ctx.getBean("contro",ControllerOperation.class);
			List<Employee> list = co.showAllEmployeeByDesg(n);
			
			list.forEach(System.out::println);
			System.out.println();
		
			
			
  		} catch (Exception e) {
						e.printStackTrace();
		}
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
