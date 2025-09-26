// Array Code - 10
// Asending Order Print

import java.util.*;
class ArrayAsending{

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Size of Array : ");
		int num = sc.nextInt();

		int[] arr= new int[num];
		System.out.println("Enter "+num+" Element : ");
		for(int i=0;i<num;i++){
		
			arr[i]= sc.nextInt();

		}
		for(int i=0;i<num-1;i++){
			for(int j=0;j<num-1-i;j++){
			if(arr[j]>arr[j+1]){
			
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			
			}
		

		}
		System.out.println("Asending Order : ");
		for(int i =0;i<num;i++){
		System.out.println(arr[i]);
		}
	}
}
