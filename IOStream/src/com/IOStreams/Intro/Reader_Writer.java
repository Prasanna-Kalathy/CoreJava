package com.IOStreams.Intro;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Reader_Writer {

	public static void main(String[] args) throws Exception {
		FileReader fr = null;
		FileWriter fw = null;
		fr = new FileReader(new File("E:\\EDU HUB\\IT Career\\Codes\\CoreJava\\Other_Supporing_Files\\Pk_New.txt"));
		fw = new FileWriter(new File("E:\\EDU HUB\\IT Career\\Codes\\CoreJava\\Other_Supporing_Files\\Pk_New_Copy.txt"));
		int i;
		while((i=fr.read())!= -1) {
			fw.write(i);
		}
		System.out.println("File Copied Sucessfully");
		fr.close();
		fw.close();
	}
}
