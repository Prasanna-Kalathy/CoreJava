package com.pk.core.oops.interfaces.multipleinterfaces;

public class MyCircle implements Circle, Circle2 {

	public static void main(String[] args) {

	}

	@Override
	public void calculateArea() {
		System.out.println(Circle2.pi);
	}

}
