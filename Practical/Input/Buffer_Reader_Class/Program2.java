// Buffer Reader

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Demo{

	public static void main(String[] args)throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
	        BufferedReader br = new BufferedReader(isr);

                System.out.println("Enter Num 1: ");
		int num1 =Integer.parseInt(br.readLine());

		System.out.println("Enter Num 2: ");
                int num2 =Integer.parseInt(br.readLine());
		
		System.out.println("num 1 : "+num1);
		System.out.println("num 2 : "+num2);
		System.out.println("Sum : "+(num1+num2));

	}
}
