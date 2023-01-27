package com.pk.ObjectMethods;

public class Test {
	public static void main(String[] args) {
		ToStringDemo ts = new ToStringDemo();
		ts.setfName("Naruto");
		ts.setlName("uzumaaki");
		ts.setId(7);

		ToStringDemo ts1 = new ToStringDemo();
		ts1.setfName("Naruto");
		ts1.setlName("uzumaaki");
		ts1.setId(7);
		
		System.out.println(ts);
		System.out.println(ts.hashCode());
		System.out.println(ts.equals(ts1));
	}
}
