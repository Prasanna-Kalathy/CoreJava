package com.pk.core.oops.inheritance.heirarchical;

public class Bus extends Vehicle {
	@Override
	void Fuel() {
		System.out.println("CNG");
	}
	
	void Display(){
		super.Fuel();
		Fuel();
	}
	public static void main(String[] args) {
		Bus bus = new Bus();
//		System.out.println(bus.Fuel());
		bus.Display();
	}
}
