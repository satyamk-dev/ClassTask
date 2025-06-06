package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.SessionFinder;

public class DepandencyInjectionTest {

	public static void main(String[] args) {
       
		
		ClassPathXmlApplicationContext ctx= 
				     new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		SessionFinder	obj = ctx.getBean("sf",SessionFinder.class);
		
		String msg = obj.SessionFinderM();
		
		System.out.println(msg);
		
		ctx.close();
		

	}

}
