// Code -4
// Exception Handling
//Compile time
//FileNotFoundException


import java.io.*;
class Demo {

	public static void main(String[] args) {
	
		try {
		FileReader file = new FileReader("abc.txt");		 

		System.out.println("File opened");
		file.close();
		} catch (FileNotFoundException e) {
		
			 System.out.println("File not Found");
		}
		catch (IOException e) {
		
			System.out.println("IOException error");
		}
	}
}
