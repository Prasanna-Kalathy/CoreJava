package com.IOStreams.Intro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class File_Io {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(new File("E:\\EDU HUB\\IT Career\\Codes\\CoreJava\\Other_Supporing_Files\\Pk_New.txt"));
			System.out.println("File Opened");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
