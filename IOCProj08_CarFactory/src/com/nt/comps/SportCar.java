package com.nt.comps;

public class SportCar implements ICar {
	
	

	public SportCar() {
		System.out.println("SportCar.SportCar()");
	}

	@Override
	public void driver() {
		System.out.println("Lambergini");
	}

}
