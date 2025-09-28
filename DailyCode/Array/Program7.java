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

	
	}catch(NumberFormatException e){
	
	}	



	int arr[] = new int[size];
	System.out.println("Enter Element of Array : ");
       try{ 
       	for(int i=0;i<arr.length;i++){
	 
		 arr[i] =Integer.parseInt(br.readLine());
	 }
       }catch(IOException io){
       
	       }catch(NumberFormatException e){
       }
	System.out.println("Array Element :");
        for(int i=0;i<arr.length;i++){	
        	System.out.println(arr[i]);
	}
	int sum =0;
	for(int i=0;i<arr.length;i++){
	
		sum =sum +arr[i];
	}
        System.out.println("Sum of Array Element is : "+sum);	
	}
}
