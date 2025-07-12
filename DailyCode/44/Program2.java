// IO Exception
import java.io.*;
class Demo {

	public static void main(String[] aegs) throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter Company Nmae :");
	String cmp = br.readLine();

        System.out.println("Company Nmae : "+cmp);
	  
	}
}
