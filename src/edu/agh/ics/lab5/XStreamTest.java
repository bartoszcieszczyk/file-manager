package edu.agh.ics.lab5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class XStreamTest {

	public static void main(String[] args) {
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("person", Person.class);
		Person person = new Person("Jan", "Nowak", "83011111249346");
		try(PrintWriter pw = new PrintWriter(new FileWriter("person.xml"))) {
			xstream.toXML(person, pw);
			System.out.println(xstream.toXML(person));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
