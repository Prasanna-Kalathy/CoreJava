package com.pk.core.oops.inheritance.heirarchical;

public class Bus extends Vehicle {
	@Override
	String Fuel() {
		super.Fuel();
		return "CNG";
	}
	
	public static void main(String[] args) {
		Bus bus = new Bus();
		System.out.println(bus.Fuel());
	}
}
