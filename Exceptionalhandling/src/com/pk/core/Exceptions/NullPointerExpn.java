package com.pk.core.Exceptions;

public class NullPointerExpn {
	static ArrayIOOB a;

	public static void main(String[] args) {
		ArrayIOOB b = new ArrayIOOB();
		b.display();
		NullPointerExpn.a.display();
	}
}
