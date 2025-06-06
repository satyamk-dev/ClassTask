package com.nt.main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Properties;

public class Test {

	public static void main(String[] args) {
//create IOC container
   AnnotationConfigApplicationContext ctx=
		   new AnnotationConfigApplicationContext(AppConfig.class);
   
   Properties pro =ctx.getBean("pInfo",Properties.class);
   
    String info =pro.toString();
    
    System.out.println(info);
    
    System.out.println("your Data");
 
   
   

	}

}
