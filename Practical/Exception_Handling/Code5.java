// Code -5
// Exception Handling
//Compile time
//InterceptedException
// error

import java.io.*;
class Demo {

	public static void main(String[] args) {
	
		Thread.sleep(5000); //error :unreported exception InterruptedException; must be caught or declared to be thrown
                System.out.println("Done");		
	}
}
