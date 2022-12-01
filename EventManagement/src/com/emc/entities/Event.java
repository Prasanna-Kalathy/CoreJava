package com.emc.entities;

import com.emc.base.EmBase;

public class Event extends EmBase {
	public String description;
	public String starttime;
	public String endtime;
	public Boolean started;

	public Event(Long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
}
