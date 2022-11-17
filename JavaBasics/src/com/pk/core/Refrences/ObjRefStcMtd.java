package com.pk.core.Refrences;

public class ObjRefStcMtd {
	static ObjRefStcMtd obj = new ObjRefStcMtd();  //obj instantiated already

	static {
		System.out.println("Inside Static \n" + ObjRefStcMtd.obj+" Address of 1st Object");
		ObjRefStcMtd.obj =  ObjRefStcMtd.init();
		System.out.println("After Init");
	}

	public static void main(String[] args) {
		System.out.println("Inside Main \n" + ObjRefStcMtd.obj+" Address of init Object");

	}

	static  ObjRefStcMtd init() {  //return type as class name for returning the object
		return new ObjRefStcMtd(); //re initializing creates new object after 1st syso
	}
}