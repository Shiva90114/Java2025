// File Handling

import java.io.*;
class FileDemo {

	public static void main(String[] args)throws IOException {
	
		// Create New File
		File fObj = new File("Incubutors.txt");

		fObj.createNewFile();
		// Create New Folder
		File dirObj = new File("Java2025");

		dirObj.mkdir();
		// Create New File in Folder

		File fObj2 = new File(dirObj,"Core2Web");
		fObj2.createNewFile();
	}
}
