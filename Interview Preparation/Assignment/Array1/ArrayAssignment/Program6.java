// Arrray  code  - 6

// Insert the value from  users and find the min number from array

import java.util.*;
class ArrayExample{

	public static void main(String[] args){
	Scanner sc = new  Scanner(System.in);

		
	        System.out.println("Enter Size of Array : ");
		int num = sc.nextInt();
	        int[] arr = new int[num];
 
		System.out.println("Enter "+num+" Element for Array : ");
		for(int i=0;i<arr.length;i++){

		       arr[i]=sc.nextInt();
		}
	
		
		int min= arr[0];
		for(int i=0;i<arr.length;i++){
		        if(arr[i]<min){
			    min=arr[i];
		           }
		}
		System.out.println("Minimum Value in Array is "+min);
	}
}
