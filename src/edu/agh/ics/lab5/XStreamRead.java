package edu.agh.ics.lab5;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class XStreamRead {

	public static void main(String[] args) {
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("person", Person.class);
		try {
			Person newJohn = (Person) xstream.fromXML(new FileReader("person.xml"));
			System.out.println(newJohn);
		} catch (FileNotFoundException | ClassCastException e) {
			e.printStackTrace();
		}
	}
}
    