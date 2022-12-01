package com.pk.employee;

public class Test {
	public static void main(String[] args) {
		String[] projects = new String[] {"Chidori","Sharingaan"};
		Manager man = new Manager(1, "kakashi", "Ninjutsu", 50000, projects,9999999);
		System.out.println(man.id);
		System.out.println(man.name);
		System.out.println(man.dept);
		System.out.println(man.salary);
		man.work();
		System.out.println();
		
		
		Developer dev = new Developer(2, "Uzumaki", "Ninjutsu", 1000000, "Full Stack java Developer and AWS");
		System.out.println(dev.name);
		System.out.println(dev.tech);
		dev.work();
		System.out.println();
		
		String[] tools = new String[] {};
		Tester tester = new Tester(3, "Sakura", "Medical", 15000, tools);
		System.out.println(tester.name);
		System.out.println(tester.dept);
		tester.work();
		System.out.println();
	}
}
