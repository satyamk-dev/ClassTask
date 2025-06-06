package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngine")
public class PetrolEngine implements IEngine {

	public PetrolEngine() {
	System.out.println("PetrolEngine.PetrolEngine()");
	}

	@Override
	public void startEngine() {
		System.out.println("PetrolEngine.startEngine()");
	}

	@Override
	public void stopEngine() {
		System.out.println("PetrolEngine.stopEngine()");
	}

}
