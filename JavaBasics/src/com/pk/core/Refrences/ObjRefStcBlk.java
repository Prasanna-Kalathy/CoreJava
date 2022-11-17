package com.pk.core.Refrences;

public class ObjRefStcBlk {
	static ObjRefStcBlk obj;
	static {
		//obj is declared but not initialised
		System.out.println("Before Object Creation "+ObjRefStcBlk.obj);
		ObjRefStcBlk.obj = new ObjRefStcBlk();
		System.out.println("After Object Creation "+ObjRefStcBlk.obj);
	}
	
	public static void main(String[] args) {
		System.out.println("After Object Creation inside Main "+ObjRefStcBlk.obj);
		
	}
}
