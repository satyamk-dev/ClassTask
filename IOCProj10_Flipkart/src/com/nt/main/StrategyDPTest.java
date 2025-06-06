package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Flipkart;


public class StrategyDPTest {

	public static void main(String[] args) {
	
		
   AnnotationConfigApplicationContext ctx=
		   new AnnotationConfigApplicationContext(AppConfig.class);
   
   Flipkart flip= ctx.getBean("fpkt",Flipkart.class);
   
   String msg = flip.shopping(new String[]{"hat","shose","pant"}, new Double[]{5555.0,3444.0,5454.0} );
   
   System.out.println(msg);
   
   ctx.close();
   
   
   
   
	}

}
