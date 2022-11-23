package com.emc.test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;

public class Test {
	public static void main(String[] args) {
		Organizer Org = new Organizer();
		Org.id = 123l;
		Org.name = "Naruto";
		System.out.println(Org.id);
		System.out.println(Org.name);

		Event event = new Event(12l, "Hokage Inaugration", "5th Hokage");

		System.out.println("The event id of " + event.id + " named " + event.name + " is to be conducted for the "
				+ event.description);

	}
}
