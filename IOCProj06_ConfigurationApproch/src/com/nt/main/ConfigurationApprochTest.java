package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.AppConfig.AppConfiguration;
import com.nt.sbeans.WeekDayFinder;

public class ConfigurationApprochTest {
	
	
	public ConfigurationApprochTest() {
		System.out.println("ConfigurationApprochTest.main()");
	}
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =
				 new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		WeekDayFinder df =ctx.getBean("wdf",WeekDayFinder.class);
		WeekDayFinder df1 =ctx.getBean("wdf",WeekDayFinder.class);
		
//		System.out.println(df.hashCode()+" "+df1.hashCode());
//		System.out.println("df==df1"+df==df1);
		
		
		
		String msg = df.WeekDayFinderMethod("Satyam");
		
		System.out.println(":::::>"+msg);
		
		ctx.close();
		
		
	}

}
