package com.pk.employee;

public class Tester extends Employee {

	String[] tools;

	public Tester(int id, String name, String dept, double salary, String[] tools) {
		super(id, name, dept, salary);
		this.tools = tools;
	}

	@Override
	protected void work() {
		super.work(); 									// the common work created in employee
		System.out.println("Tester is testing using ");
		for (int i = 0; i < tools.length; i++) {
			System.out.println(tools[i]);
		}

	}
}
