package com.pk.Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(new File("/path"));
			System.out.println("File Opened");
			
			// to read a file -> initialize a int 
			//the file ios returns a int value when it reads one byte at a time 
			
			int i;
			while ((i =fis.read())!=-1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
