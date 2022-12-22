package com.pk.Ef;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		CheckProcessortask[] cpt = { new CheckProcessortask("ATM"), new CheckProcessortask("Bank"),
				new CheckProcessortask("Mobile"), new CheckProcessortask("Web") };
		ExecutorService service = Executors.newFixedThreadPool(2);

		for (CheckProcessortask checkProcessortask : cpt) {
			service.submit(checkProcessortask);
		}
		service.shutdown();
	}
}
