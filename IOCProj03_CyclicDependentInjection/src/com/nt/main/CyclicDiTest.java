
  package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.A;
import com.nt.sbeans.B;

public class CyclicDiTest {
  
  public static void main(String args[]) {
	  
	  
	  ClassPathXmlApplicationContext ctx =
			            new ClassPathXmlApplicationContext("com/nt/cfgs/ApplicationContext.xml");
	  
	  A a = ctx.getBean("a1",A.class);
	  //B b = ctx.getBean("b1",B.class);
	  
//	  System.out.println(b);
	  
	  
	  System.out.println(a);
	  
	  ctx.close();	 
	  
	  
	  
  
  
  
  
  
  }
  
  }
  
 