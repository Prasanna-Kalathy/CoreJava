package com.pk.core.Exceptions;

public class NullPointerExpn {
	static ArrayIOOB a;

	public static void main(String[] args) {
		try {
			ArrayIOOB b = new ArrayIOOB();
			b.display();
			NullPointerExpn.a.display();
		} catch (NullPointerException e) {
			System.out.println("Object not found, Instantiate the Object First");
		}
	}
}
