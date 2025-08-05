import java.io.*;

class DirList1{

	public static void main(String[] args){
	
		File fObj =new File("./../67");
                File fObj1 =new File("Incubutors.txt");

		System.out.println(fObj.isDirectory());
		System.out.println(fObj.isFile());
		
		System.out.println(fObj1.isDirectory());
		System.out.println(fObj1.isFile());
	}
}

