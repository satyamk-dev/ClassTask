package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.Controller.HospitalController;
import com.nt.DAO.Hospital;

@SpringBootApplication
public class BootIocProj08SpringClassTaskHospitalListApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(BootIocProj08SpringClassTaskHospitalListApplication.class, args);
		HospitalController hhc =ctx.getBean("hosContro",HospitalController.class);
	try {
		List<Hospital> list=	hhc.HosCotroller("haryana","jharkhand", "rajasthan");
				for(Hospital hos: list ) {
					System.out.println(hos);
					System.out.println();
				}
			} catch (Exception e) {
		System.err.println("This error from Main class");
		e.printStackTrace();
	}
	ctx.close();
	
	}
}
