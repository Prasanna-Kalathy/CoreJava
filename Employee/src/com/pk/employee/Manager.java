package com.pk.employee;

public class Manager extends Employee {

	String[] Projects;

	public Manager(int id, String name, String dept, double salary, String[] Projects) {
		super(id, name, dept, salary);
		this.Projects = Projects;
	}

	@Override
	protected void work() {
		super.work(); // the common work created in employee
		System.out.println("Manager is managing ");
		for (int i = 0; i < Projects.length; i++) {
			System.out.println(Projects[i]);
		}

	}
}
