package com.pk.core.Exceptions.Assertions;

public class Assertion {

	public static void main(String[] args) {
		int WithDrawn = 100;
		int Bal = 60;
		
		assert (WithDrawn <= Bal):"Not Enough balance to withdrawn";
	}
}
