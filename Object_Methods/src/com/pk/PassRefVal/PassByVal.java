package com.pk.PassRefVal;

public class PassByVal {

	public static void main(String[] args) {
		int a= 10;
		System.out.println(a +" In main method"); //The value of 'a' remains unchanged
//		even though it is manipulated inside the increment method  
		System.out.println(increment(a));
	}

	static int increment(int a) {
		a = a+1;
		System.out.println(a +" In increment method");
		return a;
	}

}
