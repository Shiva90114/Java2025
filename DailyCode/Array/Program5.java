// BufferedReader
import java.io.*;

class ArrayDemo{

	public static void main(String[] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Size of Array : ");
	//int size = br.readLine();  // error
	int size = Integer.parseInt(br.readLine());
	int arr[] = new int[size];
	System.out.println("Enter Element of Array : ");
         for(int i=0;i<arr.length;i++){
	 
		 arr[i] =Integer.parseInt(br.readLine());
	 }
	System.out.println("Enter Array :");
        for(int i=0;i<arr.length;i++){	
        	System.out.println(arr[i]);
	}
	
	
	}
}
