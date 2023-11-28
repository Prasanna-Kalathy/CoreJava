package com.IOStreams.Serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializer {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			FileInputStream fis = new FileInputStream ("E:\\EDU HUB\\IT Career\\Codes\\CoreJava\\Other_Supporing_Files\\SerialDemo.ser");
			ObjectInputStream Ois =  new ObjectInputStream(fis);
			SerializableDemo DsObj = (SerializableDemo) Ois.readObject();
			
			System.out.println("Employee Id : " + DsObj.id);
			System.out.println("Employee Name : " + DsObj.Name);
			System.out.println("Employee Phone : " + DsObj.Phone);
			System.out.println("Employee SSN : " + DsObj.SSN);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
