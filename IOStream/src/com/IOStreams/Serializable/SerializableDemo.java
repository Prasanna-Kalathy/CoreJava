package com.IOStreams.Serializable;

public class SerializableDemo implements java.io.Serializable {

		int id;
		String Name;
		long Phone;
		transient int SSN;
		
		SerializableDemo (int id, String Name,long l,int SSN){
			this.id = id;
			this.Name = Name;
			this.Phone = l;
			this.SSN = SSN;
		}
}
