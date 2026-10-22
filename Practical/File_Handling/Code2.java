// Code -2 
// File Handling
//

import java.io.*;
class Demo {

	public static void main(String[] args) throws IOException {
		// Create File
		File fObj = new File("Incubutors.txt");
		
		if (fObj.exists() && fObj.isDirectory()) {
			String names[] = fObj.list();
			for(int i =0;i<names.length;i++){
		
			System.out.println(names[i]);
		}
		
		System.out.println(names.length);
		}
	}
}
