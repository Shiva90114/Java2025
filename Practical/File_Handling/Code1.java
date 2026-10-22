// Code -1 
// File Handling
//

import java.io.*;
class Demo {

	public static void main(String[] args) throws IOException {
		// Create File
		File fObj = new File("Incubutors.txt");
		fObj.createNewFile();
		// Create Floder
		File dirObj = new File("Java2025");
		dirObj.mkdir();
		// Create File in Floder
		File fObj2 = new File(dirObj,"Core2Web");
		fObj2.createNewFile();
	}
}
