import java.io.*;

class DirList {

	public static void main(String[] args){
	
		// File fObj =new File("/../67");  // error

		File fObj =new File("./../67");

		String names[] = fObj.list();
                // Length
		System.out.println(names.length);
		// Name
		for(int i=0;i<names.length;i++){
		
			System.out.println(names[i]);
		
		}
	}
}
//
//
//Exception in thread "main" java.lang.NullPointerException
//        at DirList.main(Program3.java:11)
