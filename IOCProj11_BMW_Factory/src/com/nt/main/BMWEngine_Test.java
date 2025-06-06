package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.BMW;

public final class BMWEngine_Test {
	
	public BMWEngine_Test() {
		System.out.println("BMWEngine_Test.BMWEngine_Test class ");
	}

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		BMW bm=ctx.getBean("bmw",BMW.class);
		
		String msg =bm.BuyEngine(new String[]{"Tata Engine"}, new Double[] {25000.0});
		System.out.println(msg);
		
		ctx.close();
		
		

	}

	

}
