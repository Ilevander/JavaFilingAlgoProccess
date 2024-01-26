package com.files.flux;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FluxTest {

	public static void main(String[] args) throws IOException {
        //Flux imbriqué : convert into the unit code
		int [] entiers = {110,111,112,113,114};

		DataOutputStream out =new DataOutputStream(new BufferedOutputStream(new FileOutputStream("nomFichier")));
		for(int i=0;i<entiers.length;i++)
		{
			out.writeInt(entiers[i]);
		}
			out.close();
	}

}


