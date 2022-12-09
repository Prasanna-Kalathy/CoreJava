package com.pk.core.Exceptions.custom;

public class CustomExpTest {
	public static void main(String[] args) throws CustomCheckedExceptions {
//		throw new CustomUncheckedExceptions("Maintenance Work is Going on");
		throw new CustomCheckedExceptions("Some one turned off the power");
	}
}
