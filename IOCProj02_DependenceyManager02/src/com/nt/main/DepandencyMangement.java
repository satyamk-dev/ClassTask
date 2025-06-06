package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SessionInfo;

public class DepandencyMangement {
	
	public static void main(String args[]) {
		System.out.println("DepandencyMangement.main()---Start");
		
		
		//IOC container 
		FileSystemXmlApplicationContext ctx =
				  new FileSystemXmlApplicationContext("src/com/nt/cfgs/ApplicationContext.xml");
		
		Object obj =ctx.getBean("sm");
		
		SessionInfo genrator =(SessionInfo)obj;
		
		String msg = genrator.SessionMessage("::::Satyam:::");
		
		System.out.println(msg);
		
		ctx.close();
		
		System.out.println("DepandencyMangement.main()-----End");
		
	}

}
