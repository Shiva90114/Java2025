// IO Exception
import java.io.*;
class Demo {

	public static void main(String[] aegs) throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter Company Nmae :");
	String cmp = br.readLine();
	System.out.println("Company Nmae : "+cmp);

        br.close();    

        System.out.println("Enter Company Location :");
        String loc = br.readLine();
        System.out.println("Company Location : "+loc);	  
	}
}
/*
 * Exception
 
  Exception in thread "main" java.io.IOException: Stream closed
        at java.io.BufferedReader.ensureOpen(BufferedReader.java:122)
        at java.io.BufferedReader.readLine(BufferedReader.java:317)
        at java.io.BufferedReader.readLine(BufferedReader.java:389)
        at Demo.main(Program3.java:16)
	*/

