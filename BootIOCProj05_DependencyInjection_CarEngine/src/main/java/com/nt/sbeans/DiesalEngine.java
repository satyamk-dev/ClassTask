package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngine")
public class DiesalEngine implements IEngine {

	public DiesalEngine() {
		System.out.println("DiesalEngine.DiesalEngine()");
	}

	@Override
	public void startEngine() {
		System.out.println("DiesalEngine.startEngine()");

  }

	@Override
	public void stopEngine() {
		System.out.println("DiesalEngine.stopEngine()");

	}

}
