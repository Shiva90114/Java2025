// IO Exception
import java.io.*;
class Demo {

	static void userInput() throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter Company Nmae :");
	String cmp = br.readLine();
	System.out.println("Company Nmae : "+cmp);

        br.close();    

        System.out.println("Enter Company Location :");
        String loc = br.readLine();
        System.out.println("Company Location : "+loc);	  
	}
	public static void main(String[] aegs) throws IOException {
	
		System.out.println("Start Main");
                userInput();
		System.out.println("End Main"); 
	}
}
/*
 * Exception
 
 Exception in thread "main" java.io.IOException: Stream closed
        at java.io.BufferedReader.ensureOpen(BufferedReader.java:122)
        at java.io.BufferedReader.readLine(BufferedReader.java:317)
        at java.io.BufferedReader.readLine(BufferedReader.java:389)
        at Demo.userInput(Program4.java:16)
        at Demo.main(Program4.java:22)
	
	*/

