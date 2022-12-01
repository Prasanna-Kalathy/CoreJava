package com.pk.employee;

public class Manager extends Employee {

	String[] Projects;
	double salary;
	public Manager(int id, String name, String dept, double salary, String[] Projects,double managerSalary) {
		super(id, name, dept, salary);
		System.out.println("Inside Manager class Constructor");
		this.Projects = Projects;
		this.salary =managerSalary;
	}

	@Override
	protected void work() {
		super.work(); 								// the common work created in employee
		System.out.println("Manager is managing ");
		for (int i = 0; i < Projects.length; i++) {
			System.out.println(Projects[i]);	
		}

	}
}
