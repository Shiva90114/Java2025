// Code -3
// Exception Handling
//Compile time
//FileNotFoundException
// error

import java.io.*;
class Demo {

	public static void main(String[] args) {
	
		FileReader file = new FileReader("abc.txt");//error: unreported exception FileNotFoundException; must be caught or declared to be thrown
		 
	}
}
