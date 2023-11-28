package com.IOStreams.Serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableLive {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("E:\\EDU HUB\\IT Career\\Codes\\CoreJava\\Other_Supporing_Files\\SerialDemo.ser");
			ObjectOutputStream Oos = new ObjectOutputStream(fos);
			
			SerializableDemo sd = new SerializableDemo(321, "Naruto Uzumaki", 9876543512L , 654321);
			Oos.writeObject(sd);
			System.out.println("Object Serialized sucessfully..!!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
