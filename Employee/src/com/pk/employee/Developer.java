package com.pk.employee;

public class Developer extends Employee {

	String tech;

	public Developer(int id, String name, String dept, double salary, String tech) {
		super(id, name, dept, salary);
		this.tech = tech;
	}
	
	@Override
	protected void work() {
		super.work(); // the common work created in employee
		System.out.println("Developer is Working on "+tech);
	}
}
