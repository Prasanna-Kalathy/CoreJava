package com.emc.entities;

import com.emc.base.EmBase;

public class Event extends EmBase {
	private String description;
	private String starttime;
	private String endtime;
	private Boolean started;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public Boolean getStarted() {
		return started;
	}

	public void setStarted(Boolean started) {
		this.started = started;
	}

	public Event(Long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
}
