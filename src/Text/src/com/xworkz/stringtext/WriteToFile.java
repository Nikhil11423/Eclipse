package com.xworkz.stringtext;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
		  public static void main(String[] args) {
		    try {
		      String str ="SomeMore TextIsHere";
		      File newTextFile = new File("C:/thetextfile.txt");
		      
		      FileWriter fw = new FileWriter(newTextFile);
		      fw.write(str);
		      fw.close();
		    }catch(IOException iox) {
		    	iox.printStackTrace();
		    }
		  }
}

		    



