package com.pk.core.Exceptions.checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExp {

	public void readfile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("");
	}

	public static void main(String[] args) {
		CheckedExp Ce = new CheckedExp();
		try {
			Ce.readfile();
		} catch (FileNotFoundException e) {
			System.out.println("Oops...File has taken by the Crow");
		}
	}

}
