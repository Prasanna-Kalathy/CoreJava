package com.pk.ObjectMethods;

public class ToStringDemo {
	private String fName;
	private String lName;

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
		return "First name: "+this.fName+" Last name: "+this.lName;
	}  
}
