package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Flipkart {
	@Autowired 
	@Qualifier("dtdc")	
	private ICourier courier;

	public Flipkart() {
      System.out.println("Flipkart.Flipkart(::::) 0 param constuctor");
	}
	
	//b.method
	public String shopping(String items[],Double[] prices) {
		
		System.out.println("<<:::::::::::::::::::::::::::::::::::;::::::::::::::FlipKart Shopping:::::::::::::::::::::::::::::::::::::::::::::::::::::::>>");
		//calculate bill amount
		double bill = 0.0;
		
		for (double p: prices) {
					bill =bill+p;
		}
	
		int oid =new Random().nextInt(10000);
		
		String msg = courier.deliver(oid);
		
		return Arrays.toString(items)+": \s\sare Shopped have bill amount:\s\s "+ bill +"\s======>"+msg;
	}

}
