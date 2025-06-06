package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.AppConfig.AppConfiguration;
import com.nt.ston.Printer;

public class Tester {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		Printer p1= ctx.getBean("prn1",Printer.class);
		Printer p2=ctx.getBean("prn1",Printer.class);
		
		
		System.out.println(p1.hashCode()+" " + p2.hashCode());
		System.out.println("p1==p2");
		System.out.println(p1==p2);
		
		System.out.println("=================================");
		
		Printer p3= ctx.getBean("prn2",Printer.class);
		Printer p4=ctx.getBean("prn2",Printer.class);
		
		System.out.println(p3.hashCode()+" "+p4.hashCode());
		System.out.println("p3==p4");
		System.out.println(p3==p4);
		
		
		
		
		
		
		
		
		ctx.close();


	}

}
