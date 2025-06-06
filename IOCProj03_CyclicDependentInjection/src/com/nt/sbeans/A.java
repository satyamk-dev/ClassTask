package com.nt.sbeans;

public class A {
	
	private B b;
	 
	public static void A(){
		System.out.println("no parem constructor");
	}

	public void setB(B b) {
		System.out.println("B.setB()");
		this.b = b;
	}
	
	public String toString() {
		return "B....";
	}
	
	

}
