// Array
// Code - 12

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
                boolean flag = false;
		for(int i =0;i<arr.length;i++){

                        if(num==arr[i]) {
			
				flag =true;
				break;
			} 
		}
	        if(flag==false){
			System.out.println("Not Present");
		} else {
		
			 System.out.println("Present");
		}
		
	}
}
