package com.files.UpLo;
import java.io.*;

public class CopyUpperLower {

	public static void main(String[] args) throws IOException {
		FileReader input = null;
        FileWriter outputA = null;
        FileWriter outputB = null;

        try {
            // Open the input file for reading
            input = new FileReader("origine.txt");

            // Open the output files for writing
            outputA = new FileWriter("lower.txt");
            outputB = new FileWriter("upper.txt");
  
            int c;

            while ((c = input.read()) != -1) {
                // Write the character to file 'a.txt' in lowercase
                outputA.write(Character.toLowerCase((char) c));
                // Write the character to file 'b.txt' in uppercase
                outputB.write(Character.toUpperCase((char) c));
            }
        } finally {
            // Close the resources in the finally block to ensure they are closed even if an exception occurs
            if (input != null) {
                input.close();
            }
            if (outputA != null) {
                outputA.close();
            }
            if (outputB != null) {
                outputB.close();
            }
        }
		
	}

}



