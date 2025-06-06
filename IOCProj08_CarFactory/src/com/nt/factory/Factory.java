package com.nt.factory;

import com.nt.comps.ICar;
import com.nt.comps.LuxeryCar;
import com.nt.comps.SUVcar;
import com.nt.comps.SportCar;
import com.nt.comps.StanderCar;

public class Factory {
	
	public static ICar  orderCar(String type) {
		
		ICar car=null;
		
		if(type.equalsIgnoreCase("Stander")) {
		
			car= new StanderCar();
			
		}
		else if(type.equalsIgnoreCase("Luxery")) {
			car= new LuxeryCar();
		}
		
		else if(type.equalsIgnoreCase("Sport")) {
			car =new SportCar();
			
		}
		else if(type.equalsIgnoreCase("SUV")) {
			car= new SUVcar();
			
		}
		else {
			throw new IllegalArgumentException("Invalid Car type");
		}
		
		return car;
		
	} 

}
