// Arrray  code  - 9

// Insert the value from  users and  Find Strong Number from array

import java.util.*;
class ArrayExample{
	public static int factorial(int n){
	int fact =1;
	for(int i =1;i<=n;i++){
	
		fact =fact*i;
	      }
	return fact;
	}
	public static boolean isString(int num){
	
		int sum =0,temp=num;
		while(temp != 0){
		int digit = temp %10;
		sum = sum+factorial(digit);
		temp /=10;
		}
		return sum == num;
	}

	public static void main(String[] args){
	Scanner sc = new  Scanner(System.in);

		
	        System.out.println("Enter Number of Element : ");
		int num = sc.nextInt();
	        int[] arr = new int[num];
                
		System.out.println("Enter "+num+" Element for Array : ");
		for(int i=0;i<num;i++){

		       arr[i]=sc.nextInt();
		       
		}

		boolean found = false;
		for(int i = 0;i<num;i++){
				if(isString(arr[i])){
				if(!found){
					System.out.println("Strong number in the  array : ");
					found = true;
				}
				System.out.println(arr[i]);
				}
			}	
	if(!found){
	System.out.println("No Strong Number");
	}
    }

}
