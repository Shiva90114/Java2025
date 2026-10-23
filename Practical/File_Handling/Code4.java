// Code -4
// File Handling
//File Write

import java.io.*;
class Demo {

	public static void main(String[] args) throws IOException {
		
		FileWriter obj = new FileWriter("Incubutors.txt");

		obj.write("Well Come");
		obj.write(" \n");

		// and end of File print
		// FileWriter obj = new FileWriter("Incubutors.txt",true)
		obj.close();
	}
}
