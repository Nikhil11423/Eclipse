package com.xworkz.stringtext;

import java.io.FileWriter;
import java.io.IOException;
public class File {

		  public static void main(String[] args) {
		    try {
		      FileWriter myWriter = new FileWriter("rockybhai.txt");
		      myWriter.write("Salam Rocky Bhai Salam Salam......!");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }

	}

