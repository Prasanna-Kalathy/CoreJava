package com.pk.Garbage;

public class GcRequest {
	int ObjId;

	public GcRequest(int ObjId) {
		this.ObjId = ObjId;
		System.out.println(this + " Created");
	}

	public static void main(String[] args) {
		new GcRequest(1);
		new GcRequest(2);

		for (int i = 0; i <= 100; i++) {
			System.gc();
		}
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(this + " Destroyed");
	}
}