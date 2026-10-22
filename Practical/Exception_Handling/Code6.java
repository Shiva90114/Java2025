// Code -6
// Exception Handling
//Compile time
//InterruptedException 


import java.io.*;
class Demo {

	public static void main(String[] args) {
	
		try {

		Thread.sleep(5000); 
                System.out.println("Done");		
		} catch (InterruptedException e ) {
		
			System.out.println("Thread Interrupted");
		}
	}
}
