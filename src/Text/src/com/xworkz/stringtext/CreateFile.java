package com.xworkz.stringtext;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
		  public static void main(String[] args) {
		    try {
		      File myObj = new File("test.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
		}
FileWriter myWriter = new FileWriter(test.txt);
myWriter.write("Files in Java might be tricky, but it is fun enough!");
myWriter.close();
System.out.println("Successfully wrote to the file.");
} catch (IOException e) {
System.out.println("An error occurred.");
e.printStackTrace();