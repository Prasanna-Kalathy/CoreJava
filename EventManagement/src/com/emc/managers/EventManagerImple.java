package com.emc.managers;

import com.emc.entities.Event;

public class EventManagerImple implements EventManager {

	@Override
	public Event create(long id) {
		Event event = new Event(id, null, null);
		return event;
	}

}
