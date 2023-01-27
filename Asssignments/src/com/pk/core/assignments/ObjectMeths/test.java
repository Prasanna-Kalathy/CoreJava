package com.pk.core.assignments.ObjectMeths;

public class test {

	public static void main(String[] args) {
		ElectricityBill eb = new ElectricityBill();
		eb.setMeterNo(7);
		eb.setName("Kurama");
		
		ElectricityBill eb2 = new ElectricityBill();
		eb2.setMeterNo(7);
		eb2.setName("nine tails");
		
		System.out.println(eb);
		System.out.println(eb.equals(eb2));
		System.out.println(eb.hashCode()+" "+eb2.hashCode() );
		
	}

}
