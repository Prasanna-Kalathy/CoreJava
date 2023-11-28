package com.IOStreams.Intro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderCount {

	public static void main(String[] args) {
		try (FileReader Fr = new FileReader(
				new File("E:\\EDU HUB\\IT Career\\Codes\\CoreJava\\Other_Supporing_Files\\Pk_New.txt"));
				BufferedReader Br = new BufferedReader(Fr);) {
			String line;
			int count = 0;
			while ((line = Br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line);
				while (st.hasMoreTokens()) {
					System.out.println(st.nextToken());
					count++;
				}
			}
			System.out.println("Total number of words in the file is " + count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
