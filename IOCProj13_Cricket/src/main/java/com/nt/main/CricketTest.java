package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.CrickterMan;

public final class CricketTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		CrickterMan cm=ctx.getBean("cMan",CrickterMan.class);
		
		cm.player("Ms Dhoni");
		
		ctx.close();
		

	}

}
