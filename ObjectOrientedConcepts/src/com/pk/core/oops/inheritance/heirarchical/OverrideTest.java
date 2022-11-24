package com.pk.core.oops.inheritance.heirarchical;

public class OverrideTest {
	public static void main(String[] args) {
		Car car = new Car();
		Bus bus = new Bus();
		Bike bike = new Bike();
		
		System.out.println("Fuel for car is "+car.Fuel());
		System.out.println("Fuel for bike is "+bike.Fuel());
		System.out.println("Fuel for bus is "+bus.Fuel());
;	}
}
