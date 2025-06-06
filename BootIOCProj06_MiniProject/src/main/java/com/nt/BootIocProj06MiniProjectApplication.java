package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.DAO.Employee;
import com.nt.controller.ControllerOperation;

@SpringBootApplication
public class BootIocProj06MiniProjectApplication {

	@Autowired 
    private final ControllerOperation contro;

    BootIocProj06MiniProjectApplication(ControllerOperation contro) {
        this.contro = contro;
    }

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(BootIocProj06MiniProjectApplication.class, args);
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter first Desg1\t:");
		String d1 =sc.next();
		System.out.println("Enter first Desg2\t:");
		String d2=	sc.next();
		System.out.println("Enter first Desg3\t:");
		String d3 =sc.next();
		
		try {
			ControllerOperation co=ctx.getBean("contro",ControllerOperation.class);
			List<Employee> list = co.showAllEmployeeByDesg(d1, d2, d3);
			
			list.forEach(emp->{
				System.out.println(emp);
			});
			
			
  		} catch (Exception e) {
						e.printStackTrace();
		}
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
