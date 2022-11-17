package com.pk.core.Refrences;

public class ObjRefNonStcMtd {
	static ObjRefNonStcMtd obj = new ObjRefNonStcMtd(); // obj instantiated already

	public static void main(String[] args) {
		System.out.println("Inside Main \n" + ObjRefNonStcMtd.obj + " Address of init Object");
		obj.init();
	}

	void init() {
		System.out.println("Inside Init before re initialization "+ObjRefNonStcMtd.obj);
		ObjRefNonStcMtd obj = new ObjRefNonStcMtd();
		System.out.println("Inside Init after re initialization "+ObjRefNonStcMtd.obj);
		System.out.println("Inside Init after re initialization "+obj); //scope of this obj is within this non static method
	}
}