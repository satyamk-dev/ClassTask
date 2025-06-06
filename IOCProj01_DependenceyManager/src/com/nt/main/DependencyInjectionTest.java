package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		System.out.println("DependencyInjectionTest.main().....Start");
		
    //Create IOC Container
		FileSystemXmlApplicationContext ctx= 
				new FileSystemXmlApplicationContext("src/com/nt/cfgs/ApplicationContext.xml");
		//Get Target Spring bean class object
		Object obj = ctx.getBean("wmg");
		//typeCasting 
		WishMessageGenerator generator= (WishMessageGenerator)obj;
		
		String user ="Satyam";
		//invoke the b.Method
		String msg = generator.WishMessage(user);
		
		
		System.out.println(msg);		
		//Close Container
		ctx.close();
		
		System.out.println("DependencyInjectionTest.main().....End");

	}

}
