// Arrray  code  - 7

// Insert the value from  users and Sum of Array Element

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
	
		
		int sum= 0;
		for(int i=0;i<arr.length;i++){
		        
			    sum=sum+arr[i];
		           
		}
		System.out.println("Sum of Array Element is "+sum);
	}
}
