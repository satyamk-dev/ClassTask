package com.nt.sbeans;

import org.springframework.stereotype.Component;


@Component("pEngine")
public class PetrolEngine implements IEngine {

	@Override
	public void startEngine() {
		System.out.println("PetrolEngine:::::::::::::::::::Start 🏁");

	}

	@Override
	public void stopEngine() {
		System.out.println("PetrolEngine::::::::::::::::::::>Stop 🚧");
	}

}
