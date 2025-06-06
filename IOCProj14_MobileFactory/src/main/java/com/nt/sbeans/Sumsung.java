package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Lazy(true)
@Component("samsung")
public final class Sumsung implements Mobile {

	@Override
	public void Tranding() {
		System.out.println("Samsung Moblie is Tranding 📱");

	}

}
