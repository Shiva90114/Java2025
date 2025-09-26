// Arrray  code  - 2

// insert element from user and Print Arrray Element

import java.util.*;
class ArrayExample{

	public static void main(String[] args){
	Scanner sc = new  Scanner(System.in);

		int[] arr = new int[5];
 
		System.out.println("Enter 5 Element for Array : ");
		for(int i=0;i<arr.length;i++){

		       arr[i]=sc.nextInt();
		}
	
		System.out.println("Array Element are : ");
		for(int i=0;i<arr.length;i++){
		
			System.out.println(arr[i]);
		}
	}
}
