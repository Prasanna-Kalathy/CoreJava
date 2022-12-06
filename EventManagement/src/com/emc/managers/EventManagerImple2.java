package com.emc.managers;

import com.emc.entities.Event;

public class EventManagerImple2 implements EventManager {

	@Override
	public Event create(long id) {
		Event event = new Event(id, "Nano Launch", "3rd Gen Nano car Grand launch");
		return event;
	}

}
