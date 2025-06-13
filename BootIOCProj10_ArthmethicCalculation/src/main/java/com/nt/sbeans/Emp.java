package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eem")
public class Emp {
	
	@Value("${emp.name}")
	private String name;
	
	@Value("${emp.age}")
	private Integer age;
	
	@Value("${emp.job}")
	private String job;
	
//	@Value("${emp.sal}")
//	private Double sal;
//	
//	@Value("${emp.comm}")
//	private Double comm;
	
	//@Value("#{${emp.sal}-${emp.comm}}")
	//private Double total;
	
	@Value("#{acc.salary+acc.comm}")
	private Double totalSal;
	
	@Value("${os.name}")
	private String OsName;

	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", job=" + job + ", totalSal=" + totalSal + ", OsName=" + OsName
				+ "]";
	}

	

	

	
	
	
	
	
	
	
	

}
