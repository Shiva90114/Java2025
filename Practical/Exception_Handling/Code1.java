// Code -1
// Exception Handling
//Compile time
//IOException
// error
import java.io.*;
class Demo {

	public static void main(String[] args) {
	
		FileReader file = new FileReader("data.txt");// unreported exception IOException; must be caught or declared to be thrown
		 int ch = file.read(); // unreported exception IOException; must be caught or declared to be thrown

		System.out.println((char)ch);
	}
}
