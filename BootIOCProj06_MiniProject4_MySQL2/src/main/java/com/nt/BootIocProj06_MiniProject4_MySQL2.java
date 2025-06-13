package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.DAO.Employee;
import com.nt.controller.ControllerOperation;

@SpringBootApplication
public class BootIocProj06_MiniProject4_MySQL2 {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(BootIocProj06_MiniProject4_MySQL2.class, args);
		
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter Your Name\t:");
	
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
