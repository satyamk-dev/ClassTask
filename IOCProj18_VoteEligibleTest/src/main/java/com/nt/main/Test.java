package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.VoteEligiblecriteria;

public class Test {

	public static void main(String[] args) {

		
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		VoteEligiblecriteria vc= ctx.getBean("vec",VoteEligiblecriteria.class);
		
		String msg =vc.VoteAgeCheker();
		
		System.out.println(msg);
		
		ctx.close();

	}

}
