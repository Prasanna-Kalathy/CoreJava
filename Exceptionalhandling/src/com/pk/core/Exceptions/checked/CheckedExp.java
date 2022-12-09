package com.pk.core.Exceptions.checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExp {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("");
		} catch (FileNotFoundException e) {
			System.out.println("Oops...File has taken by the Crow");
		}
	}

}
