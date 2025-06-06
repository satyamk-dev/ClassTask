package com.nt.main;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Config.AppConfig;

public class LanguageTest {

	public static void main(String[] args) {
		//create IOC container
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter Language\t:");
		String lang=sc.next();
		
		System.out.print("Enter Country\t:");
		String country=sc.next();
		
//		@SuppressWarnings("deprecation")
		//Locale local =new Locale(lang,country);
		Locale local= Locale.of(lang,country);
		
		String msg1 =ctx.getMessage("welcome.msg", new String[] {"student"}, "msg1", local);
		String msg2=ctx.getMessage("goodbye.msg", new String[] {}, "msg2", local);
		String msg3=ctx.getMessage("gap.msg", new String[] {}, "msg3", local);
		String msg4=ctx.getMessage("love.msg", new String[] {}, "msg4", local);
		
		System.out.println("welcome\t\t\t:\s"+msg1);
		System.out.println("goodBuy\t\t\t:\s"+msg2);
		System.out.println("gapMessage\t\t:\s"+msg3);
		System.out.println("loveMessage\t\t:\s"+msg4);
		
		//Close Container destroy object
		ctx.close();
		

	}

}
