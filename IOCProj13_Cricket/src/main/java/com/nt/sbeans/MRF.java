package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("mrf")
public final class MRF implements Bat {

	@Override
	public void batting() {
	     System.out.println("Chossing MRF Bat::::::::::::::🏏 ");

	}

}
