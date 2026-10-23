// Code -3 
// File Handling
//

import java.io.*;
class Demo {

	public static void main(String[] args) throws IOException {
		
		File fObj = new File("Java.txt"); // Create Object
		fObj.createNewFile();  // create File
		File fObj1 = new File("Incubutors.txt");
			
		System.out.println(fObj.isDirectory()); //f
		System.out.println(fObj.isFile());      //f

		System.out.println(fObj1.isDirectory()); //f
		System.out.println(fObj1.isFile());      //t
							 
		System.out.println(fObj.exists()); // not exits
                System.out.println(fObj1.exists()); // exits

	}
}
