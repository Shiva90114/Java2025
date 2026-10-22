// Code -2
// Exception Handling
//Compile time
//IOException

import java.io.*;
class Demo {

	public static void main(String[] args) {
	
		try {
		FileReader file = new FileReader("data.txt");
		int ch = file.read();

		System.out.println((char)ch);
		file.close();
		} catch (IOException e) {
		
			System.out.println("Input/Output error");
		}


		
	}
}
