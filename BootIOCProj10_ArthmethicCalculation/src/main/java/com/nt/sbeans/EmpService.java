package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("acc")
@Data
public class EmpService {
	
	@Value("${acc.sal}")
	private Double salary;
	
	@Value("${acc.comm}")
	private Double comm;

}
