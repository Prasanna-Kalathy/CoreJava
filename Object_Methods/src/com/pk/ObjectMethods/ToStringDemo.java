package com.pk.ObjectMethods;

public class ToStringDemo {
	private int id;
	private String fName;
	private String lName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;

	}

	@Override
	public String toString() {
		return "First name: " + this.fName + " Last name: " + this.lName;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		ToStringDemo Eq = (ToStringDemo) obj;
		if (Eq.getId() == this.getId()) {
			return true;
		}
		return false;
	}
}
