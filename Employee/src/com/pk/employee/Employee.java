package com.pk.employee;

public class Employee {
	int id;
	String name;
	String dept;
	double salary;

	public Employee(int id, String name, String dept, double salary) {
		System.out.println("inside Employee class constructor");
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	protected void work() {
		System.out.println("Common work for Everyone");
	}

}
