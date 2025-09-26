// Arrray  code  - 6

// size and element from user for array and Print and Remove Element

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
	
		System.out.println("Enter Element Which remove :");
		int rem = sc.nextInt();
		int remove = -1;
		for(int i=0;i<arr.length;i++){
		       if(arr[i]== rem){
		         remove = i;
			 break;
		       } 
	        }
		int[] newArr = null;

		if(remove != -1){
		
			newArr = new int[arr.length-1];
			for(int i=0,j=0;i<arr.length;i++){
			if(i!= remove){
			 newArr[j++] = arr[i];
			}
			}
		}
		System.out.println("Element of Array : ");
		if(newArr != null){
		   for(int i=0;i<newArr.length;i++){
	          	System.out.println(newArr[i]);
		    }
		}else{
			 for(int i=0;i<arr.length;i++){
     				 System.out.println(arr[i]);
                             }
		}
	}
}
