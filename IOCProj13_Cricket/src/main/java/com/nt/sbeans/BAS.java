package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("bas")
public final class BAS implements Bat {

	@Override
	public void batting() {
		System.out.println("Chooing BAS bat::::::::::::::::::🏏");

	}

}
