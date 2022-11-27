package com.pk.core.oops.abstraction;

public class AbstractionTest {
	public static void main(String[] args) {
		ThreeSeries Ts = new ThreeSeries();

		Ts.accelerate();
		Ts.commonFunc();

		FiveSeries Fs = new FiveSeries();

		Fs.accelerate();
		Fs.commonFunc();
	}
}
