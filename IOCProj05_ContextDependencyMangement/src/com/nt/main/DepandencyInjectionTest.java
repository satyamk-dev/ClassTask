package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.WeekDayFinder;

public class DepandencyInjectionTest {
	

	public static void main(String[] args) {
	      ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
	      WeekDayFinder obj= ctx.getBean("sf",WeekDayFinder.class);
	      
	      String msg = obj.WeekDayFinderMethod("satyam");
	      
	      System.out.println(msg);
	      
	      ctx.close();
	      
	}

}
