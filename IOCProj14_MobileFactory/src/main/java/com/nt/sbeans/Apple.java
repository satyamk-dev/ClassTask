package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Lazy(true)
@Component("iphone")
public final class Apple implements Mobile {

	@Override
	public void Tranding() {
		System.out.println("Now IPhone mobile is Tranding📱");

	}

}
