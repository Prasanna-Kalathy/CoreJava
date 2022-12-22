package com.pk.Ef;

public class CheckProcessortask implements Runnable {

	String name;

	public CheckProcessortask(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + " Check Processor has began " + Thread.currentThread().getName());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(name + " Check Processor has began " + Thread.currentThread().getName());
		
	}


}
