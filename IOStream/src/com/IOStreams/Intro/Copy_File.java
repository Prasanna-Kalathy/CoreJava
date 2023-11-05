package com.IOStreams.Intro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_File {

	public static void main(String[] args) {
		// Declaring the Fis for reading
		// Declaring the Fos for Writing
		FileInputStream fis = null;
		FileOutputStream fos = null;
		// Instantiating the Fis and Fos
		try {
			fis = new FileInputStream(
					new File("E:\\EDU HUB\\IT Career\\Codes\\CoreJava\\Other_Supporing_Files\\test.jpg"));
			fos = new FileOutputStream(
					new File("E:\\EDU HUB\\IT Career\\Codes\\CoreJava\\Other_Supporing_Files\\test_Copy.jpg"));
			int i;
			while ((i = fis.read()) != -1) {
				fos.write(i);
			}
			System.out.println("Files Copied sucessfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
