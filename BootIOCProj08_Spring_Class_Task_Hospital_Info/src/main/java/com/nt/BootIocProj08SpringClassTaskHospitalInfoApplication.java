package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.DAO.Hospital;
import com.nt.controller.ControllerOp;

@SpringBootApplication
public class BootIocProj08SpringClassTaskHospitalInfoApplication {

	public static void main(String[] args) {
		System.out.println("main Start");
		ConfigurableApplicationContext ctx= SpringApplication.run(BootIocProj08SpringClassTaskHospitalInfoApplication.class, args);
		
		Scanner sc =new Scanner(System.in);
		
	System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::Hyderabad Hospitel Bad Info:::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	System.out.print("Enter Hospitel Name\t");
	String inpName =sc.nextLine().trim();
	ControllerOp co= ctx.getBean("HosContro", ControllerOp.class);
			try {
				List<Hospital> list = co.HPController(inpName);
				list.forEach(msg->{
					System.out.println(msg);
				});
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("main End");
		
		
	}

}
