import java.io.*;

class FileRead{

	public static void main(String[] args)throws FileNotFoundException{
	
		FileReader fr = new FileReader("Biencaps.txt");
	
	}
}
/*
 * Program8.java:7: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
                FileReader fr = new FileReader("Incubators.txt");
                                ^
1 error
  *Exception in thread "main" java.io.FileNotFoundException: Biencaps.txt (No such file or directory)
        at java.io.FileInputStream.open0(Native Method)
        at java.io.FileInputStream.open(FileInputStream.java:195)
        at java.io.FileInputStream.<init>(FileInputStream.java:138)
        at java.io.FileInputStream.<init>(FileInputStream.java:93)
        at java.io.FileReader.<init>(FileReader.java:58)
        at FileRead.main(Program8.java:7)
*/
