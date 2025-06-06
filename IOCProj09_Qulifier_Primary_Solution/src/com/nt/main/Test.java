package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.sbeans.WeekDayFinder;

public class Test {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(com.nt.cfgs.AppConfig.class);

		WeekDayFinder dt =ctx.getBean("wdf",WeekDayFinder.class);
		
		String msg = dt.weekDayFinder();
		
		System.out.println(msg);
		
	}

}
