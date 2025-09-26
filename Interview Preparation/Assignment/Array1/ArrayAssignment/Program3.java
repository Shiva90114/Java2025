// Arrray  code  - 3

// size and element from user for array and Print Arrray Element

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
	
		System.out.println("Array Element are : ");
		for(int i=0;i<arr.length;i++){
		
			System.out.println(arr[i]);
		}
	}
}
