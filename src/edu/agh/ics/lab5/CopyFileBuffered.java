package edu.agh.ics.lab5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyFileBuffered {
	
	public void copyFileBuffered(String input, String output) {
		try (BufferedReader br = new BufferedReader(new FileReader(input));
				PrintWriter pw = new PrintWriter(new FileWriter(output))) {
			String line;
			while ((line = br.readLine()) != null) {
				pw.println(line);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
