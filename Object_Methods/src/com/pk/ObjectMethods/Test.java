package com.pk.ObjectMethods;

public class Test {
	public static void main(String[] args) {
		ToStringDemo ts = new ToStringDemo();
		ts.setfName("Naruto");
		ts.setlName("uzumaaki");
		System.out.println(ts);
		System.out.println(ts.hashCode());
	}
}
