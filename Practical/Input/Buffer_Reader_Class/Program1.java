// Buffer Reader

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Demo{

	public static void main(String[] args)throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
	
		System.out.println("Enter Name : ");
	        String name = br.readLine();// String
	
	
		System.out.println("Enter Age : ");
                int num = Integer.parseInt(br.readLine()); // Number

		System.out.println("Name : "+name);
		System.out.println("Age : "+num);
	
	}
}
