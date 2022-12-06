package com.emc.test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;
import com.emc.managers.EventManagerImple;

public class Test {
	public static void main(String[] args) {
		Organizer Org = new Organizer();
		Org.setId(123l);
		Org.setName("Naruto");
		System.out.println(Org.getId());
		System.out.println(Org.getName());

		Event event = new Event(12l, "Hokage Inaugration", "5th Hokage");

		System.out.println("The event id of " + event.getId() + " named " + event.getName()
				+ " is to be conducted for the " + event.getDescription());
		EventManagerImple em = new EventManagerImple();
		System.out.println(em.create(12654));
		System.out.println(em.create(12654).getId());

	}
}
