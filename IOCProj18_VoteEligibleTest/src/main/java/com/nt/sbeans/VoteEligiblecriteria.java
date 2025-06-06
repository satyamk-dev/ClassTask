package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("vec")
public class VoteEligiblecriteria {
	
	@Value("${info.name}")
	private String name;
	@Value("${info.age}")
	private Integer age;
	private LocalDateTime dov;
	
	@PostConstruct
	public void myinit() {
		System.out.println("myinit()");
		dov = LocalDateTime.now();
		if(name==null || age<=0) {
		   throw new IllegalArgumentException("set correct value name and age");
		}
	}
	
	public VoteEligiblecriteria() {
	System.out.println("VoteEligiblecriteria()");
	}
	public String VoteAgeCheker() {
		if(age<18) {
			return "You are Not Eligible for vote::"+name+"=== "+dov.toLocalDate();
		}
		else {
			return "You are Eligible for vote"+name+"==="+dov.toLocalDate();
		}
	}
	
	@PreDestroy
	public void myDestroy() {
		System.out.println("myDestroy()");
		name=null;
		age=null;
		dov=null;
		
	}
	
}
