package com.pk.core.Refrences;

public class ObjRefStatic {
	static ObjRefStatic obj;
	static {
		//obj is declared but not initialised
		System.out.println("Before Object Creation "+ObjRefStatic.obj);
		ObjRefStatic.obj = new ObjRefStatic();
		System.out.println("After Object Creation "+ObjRefStatic.obj);
	}
	
	public static void main(String[] args) {
		System.out.println("After Object Creation inside Main "+ObjRefStatic.obj);
		
	}
}
