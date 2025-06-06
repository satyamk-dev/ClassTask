package com.nt;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.DAO.Employee;
import com.nt.controller.EController;

@SpringBootApplication
public class BootIocProj06MiniProject2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(BootIocProj06MiniProject2Application.class, args);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employe name \t:");
		String Ename = sc.next().toUpperCase();
		System.out.println("Enter Employee Job \t:");
		String Job = sc.next().toUpperCase();
		System.out.println("Enter Employee Salary\t:");
		double Sal= sc.nextDouble();
		
		Employee emp =new Employee();
		
		
		
		emp.setName(Ename);
		emp.setJob(Job);
		emp.setSalary(Sal);
		
		try {
			EController mc =ctx.getBean("empConto",EController.class);
			String msg = mc.EmployeeController(emp);
			
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ctx.close();
	}

}
