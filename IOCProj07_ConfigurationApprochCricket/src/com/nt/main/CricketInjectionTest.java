package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.AppConfig.AppConfig;
import com.nt.sbeans.CricketRuns;

public class CricketInjectionTest {
	
	

	public CricketInjectionTest() {
	System.out.println("CricketInjectionTest.CricketInjectionTest()");
	}

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=
				    new AnnotationConfigApplicationContext(AppConfig.class);
		
		CricketRuns cr= ctx.getBean("Cr",CricketRuns.class);
		
		String msg = cr.RunChecker("Ms Dhoni");
		
		System.out.println(msg);

		ctx.close();
	}

}
