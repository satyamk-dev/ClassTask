package com.nt.sbeans;

public class B {
	
	private A a ;
	
	public static void B() {
		System.out.println("No param construtor");
	}

	public void setA(A a) {
		System.out.println("A.setA()");
		this.a = a;
	}
	
	public String toString() {
		return "A...";
	}

}
