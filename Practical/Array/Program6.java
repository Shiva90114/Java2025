// Array
// Code - 6

import java.util.Arrays;
import java.util.Scanner;

class UserInput {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int size = sc.nextInt();
                
		int arr[] = new int[size];

		System.out.println("Enter data : ");
		for(int i =0;i<arr.length;i++) {
		
			arr[i] = sc.nextInt();
		}
		 System.out.println("Array : ");
		 for(int i =0;i<arr.length;i++) {

                        System.out.print(arr[i]+" ");
                }
                System.out.println();


	}
}
