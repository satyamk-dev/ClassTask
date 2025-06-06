package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.MobileShop;

public final class AnnotationTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);

		MobileShop ms= ctx.getBean("mshop", MobileShop.class);
		
		ms.Shop("India");
		
		ctx.close();
		
		
	}

}
