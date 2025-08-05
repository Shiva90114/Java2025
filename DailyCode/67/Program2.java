import java.io.*;

class DirList {

	public static void main(String[] args){
	
		File fObj =new File("/home/shivanand/Java2025/DailyCode/67");

		String names[] = fObj.list();
                // Length
		System.out.println(names.length);
		// Name
		for(int i=0;i<names.length;i++){
		
			System.out.println(names[i]);
		
		}
	}
}
