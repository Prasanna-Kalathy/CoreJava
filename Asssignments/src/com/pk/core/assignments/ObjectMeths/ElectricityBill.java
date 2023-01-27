package com.pk.core.assignments.ObjectMeths;

public class ElectricityBill {
	private int meterNo;
	private String name;
	private String address;

	public int getMeterNo() {
		return meterNo;
	}

	public void setMeterNo(int meterNo) {
		this.meterNo = meterNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return this.getMeterNo() + " " + this.getName();
	}

	@Override
	public boolean equals(Object obj) {
		ElectricityBill eb = (ElectricityBill) obj;
		if (eb.getMeterNo() == this.getMeterNo()) {
			return true;
		} else
			return false;
	}

	@Override
	public int hashCode() {
		return this.getMeterNo();
	}

}
