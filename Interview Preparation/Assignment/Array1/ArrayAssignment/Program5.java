// Arrray  code  - 5

// size and element from user for array and Print Arrray  max  Number 

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
	
		
		int max= arr[0];
		for(int i=0;i<arr.length;i++){
		        if(arr[i]>max){
			    max=arr[i];
		           }
		}
		System.out.println("Maximum Value in Array is "+max);
	}
}
