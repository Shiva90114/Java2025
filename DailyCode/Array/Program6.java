// BufferedReader
import java.io.*;

class ArrayDemo{

	public static void main(String[] args){
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Size of Array : ");
	int size=0;
	try{
	 size = Integer.parseInt(br.readLine());
	}catch(IOException e){

	
	}	



	int arr[] = new int[size];
	System.out.println("Enter Element of Array : ");
       try{ 
       	for(int i=0;i<arr.length;i++){
	 
		 arr[i] =Integer.parseInt(br.readLine());
	 }
       }catch(IOException io){
       
       }
	System.out.println("Array Element :");
        for(int i=0;i<arr.length;i++){	
        	System.out.println(arr[i]);
	}
	
	
	}
}
