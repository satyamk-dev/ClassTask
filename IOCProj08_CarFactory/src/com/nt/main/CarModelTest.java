package com.nt.main;

import com.nt.comps.ICar;
import com.nt.factory.Factory;

public class CarModelTest {
	
	public CarModelTest() {
     System.out.println("CarModelTest.CarModelTest()");
	}

	public static void main(String[] args) {
		
		ICar car = Factory.orderCar("Stander");
		
		car.driver();
		
		ICar car1 =Factory.orderCar("Luxery");
		car1.driver();
		
		ICar car2= Factory.orderCar("Sport");
		
		car2.driver();
		
		ICar car3 = Factory.orderCar("SUV");
		
		car3.driver();
		
		
	}

}
