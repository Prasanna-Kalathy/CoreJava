package com.pk.StaticVsNonStatic;

public class StaticMethods {

	public static void main(String[] args) {
		// Using static method: doesn't need an object, use class name
		double circumference = Circle.calculateCircumference(5.0);
		System.out.println("Circumference: " + circumference);

		// Using non-static method: requires an object, use instance
		Circle circle = new Circle(5.0);
		double area = circle.calculateArea();
		System.out.println("Area: " + area);
		
		//Accessing the Pi from Circle class
		System.out.println(Circle.PI);
		
		//Accessing the Radius which is Object specific that is been assigned while creating the object itself
		Circle cir = new Circle(5);
		System.out.println(cir.radius);
	}
}
