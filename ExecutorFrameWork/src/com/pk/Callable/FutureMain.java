package com.pk.Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureMain {

	public static void main(String[] args) {
		MyCallable[] cal = { new MyCallable(10), new MyCallable(20), new MyCallable(30), new MyCallable(40),
				new MyCallable(50), new MyCallable(60)};
		ExecutorService service = Executors.newFixedThreadPool(3);

		for (MyCallable myCallable : cal) {
			Future<Integer> future = service.submit(myCallable);

			try {
				System.out.println(future.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		service.shutdown();
	}

}
