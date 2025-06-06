package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("pInfo")
@PropertySource("com/nt/common/info.properties")
public class Properties {
	
	@Value("${pre.sno}")
	private int sno;
	
	@Value("${pre.sname}")
	private String sname;
	
	@Value("${pre.add}")
	private String add;

	@Override
	public String toString() {
		return "Properties [sno=" + sno + ", sname=" + sname + ", add=" + add + "]";
	}

	
	
}
