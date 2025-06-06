package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngine")
public class ElectricalEngine implements IEngine {

	@Override
	public void startEngine() {
	System.out.println("ElectricalEngine:::::::::::::::::::>Start 🏁");
	}

	@Override
	public void stopEngine() {
		System.out.println("ElectricalEngine::::::::::::::::::>Stop 🚧");

	}

}
