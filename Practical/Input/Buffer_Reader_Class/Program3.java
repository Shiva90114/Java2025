// Buffered Reader 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Demo{

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Socity Name : ");
                String name= br.readLine();

		System.out.println("Enter Wing Name");
		// char wing = (char)br.read();
		// br.skip(1);
		char wing = br.readLine().charAt(0);

                System.out.println("Enter Flat Number  ");
		int flat =Integer.parseInt(br.readLine());
                                 
                System.out.println("Enter Rent : ");
		float rent =Float.parseFloat(br.readLine());
                          

		System.out.println("Socity Name : "+name);
		System.out.println("Wing : "+wing);
		System.out.println("Flat Name : "+flat);
		System.out.println("Rent : "+rent);
	}

}
