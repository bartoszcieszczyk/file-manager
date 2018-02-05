package edu.agh.ics.lab5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serial {
	
	public void serializePerson(String fileName) {
		Person p = new Person("Ala", "Nowak", "8612131");
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
			out.writeObject(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void deserializePerson(String fileName) {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
			Person p = (Person) in.readObject();
			System.out.println(p);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Serial serial = new Serial();
		//serial.serializePerson("person.ser");
		serial.deserializePerson("person.ser");
	}

}
