package com.IOStreams.Intro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File_Io {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(new File("E:\\EDU HUB\\IT Career\\Codes\\CoreJava\\Other_Supporing_Files\\Pk_New.txt"));
			System.out.println("File Opened");
			int i;
			while((i = fis.read())!=-1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
