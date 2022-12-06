package com.pk.core.oops.polymorphism.runtimepoly;

public class RuntimePolymorphism {
	public static void main(String[] args) {
		AppleLaptop mbp1 = new MacBookPro();
		mbp1.shutdown();
		mbp1.start();
//		mbp1.Prosmethod();	can't invoke since it is not in the parent interface 
		
		MacBookPro m3 = (MacBookPro) mbp1;
		m3.Prosmethod();
		
		AppleLaptop mbp2 = new MacBookAir();
		mbp2.shutdown();
		mbp2.start();
	}
}
