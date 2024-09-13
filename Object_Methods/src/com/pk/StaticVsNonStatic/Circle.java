package com.pk.StaticVsNonStatic;

public class Circle {
	// Instance variable (specific to each Circle object)
    double radius;
    
    // Static variable (shared by all instances of Circle)
    static final double PI = 3.14159;
//    By default the access modifier will be the package level
    
//    To Share the Value with the classes outside the packages we need to use the public 
//    public static final double PI = 3.14159;

    // Constructor to initialize the radius
    Circle(double radius) {
        this.radius = radius;
    }

    // Non-static method: logic requires the radius specific to this instance
    double calculateArea() {
        return PI * radius * radius;
    }

    // Static method: logic doesn't need any instance-specific data
    static double calculateCircumference(double radius) {
        return 2 * PI * radius;
    }
}
