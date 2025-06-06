package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Lazy(true)
@Component("mi")
public final class MI implements Mobile {

	@Override
	public void Tranding() {
		System.out.println("MI Mobile is tranding📳");

	}

}
