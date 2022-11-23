package com.emc.test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;

public class Test {
	public static void main(String[] args) {
		Organizer Org = new Organizer();
		Org.id=123l;
		Org.name="Naruto";
		System.out.println(Org.id);
		System.out.println(Org.name);
		
		Event event = new Event();
		event.id=12l;
		event.name="Hokage Inaguration";
		event.description="6th Hokage";
		System.out.println(event.description);
		
	}
}
