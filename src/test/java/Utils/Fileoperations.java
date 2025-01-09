package Utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Fileoperations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
			

				// Creating object of FileReader and BufferedReader 
				// class 
		char[] array = new char[100];

	    try {
	      // Creates a FileReader
	      FileReader file = new FileReader("C:\\Users\\kanhu\\OneDrive\\Desktop\\kanhusfdhhgsfd\\2024CucumberUIAPIproject\\src\\test\\resources\\data\\data.txt");

	      // Creates a BufferedReader
	      BufferedReader input = new BufferedReader(file);

	      // Reads characters
	      input.read(array);
	      System.out.println("Data in the file: ");
	      System.out.println(array);

	      // Closes the reader
	      input.close();
	    }

	    catch(Exception e) {
	      e.getStackTrace();
	    }
					
				}
				}
			
		

	    
			


