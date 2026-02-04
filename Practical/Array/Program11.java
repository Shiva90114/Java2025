// Array
// Code - 11

import java.util.Scanner;
class UserInput {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter Array Data : ");
		for(int i =0;i<arr.length;i++){
		
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter Element to Search : ");
                int num = sc.nextInt();

		for(int i =0;i<arr.length;i++){

                        if(num==arr[i]) {
			
				System.out.println("Present");
				break;`
			} else {
			
				System.out.println("Not Present");
			}
                }
		
	}
}
