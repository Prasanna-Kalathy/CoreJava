package com.emc.entities;

import com.emc.base.EmBase;

public class Participants extends EmBase {
	private String email;
	private Boolean checkedin;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getCheckedin() {
		return checkedin;
	}

	public void setCheckedin(Boolean checkedin) {
		this.checkedin = checkedin;
	}
}
