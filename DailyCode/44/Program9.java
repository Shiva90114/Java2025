// IO Exception
import java.io.*;
class Demo {

	static void userInput() throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter Company Name :");
	String cmp = br.readLine();
	System.out.println("Company Nmae : "+cmp);

         

        System.out.println("Enter Employee Id :");
        int empId = Integer.parseInt(br.readLine());
        System.out.println("Employee Id : "+empId);	  
	}
	public static void main(String[] args) throws IOException {
	
		System.out.println("Start Main");
                userInput();
		System.out.println("End Main"); 
	}
}
/*
 * Exception
 Exception in thread "main" java.lang.NumberFormatException: For input string: "j"
        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.lang.Integer.parseInt(Integer.java:580)
        at java.lang.Integer.parseInt(Integer.java:615)
        at Demo.userInput(Program9.java:16)
        at Demo.main(Program9.java:22)
 
*/
