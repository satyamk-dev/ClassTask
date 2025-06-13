package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("hot")
@Data
@PropertySource("prop1.properties")
public class Hotel {
	 
	 @Value("#{${csmt.info.idlee}+${csmt.info.dosa}}")
	 private Integer Billtotal;

	
	
	

}
