package txt.files.code;

import java.io.*;

import java.io.IOException;

public class CopyCharacters 

{
	public static void main(String[] args) throws IOException
	{

		FileReader input = null;
		FileWriter output = null;		
		
		input = new FileReader("origine.txt");
		output = new FileWriter("copie.txt");

		int c;

		while ((c = input.read()) != -1) 
		{
			output.write(c);
		}
		if (input != null)
		{
			input.close();
		}
		if(output != null)
		{
			output.close();
		}
	}

}	
