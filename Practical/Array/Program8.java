// Array
// Code - 8
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class ArrayDemo {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array Size : ");
		int  size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		System.out.println("Enter Array Data : ");
		for(int i =0;i<arr.length;i++) {
		
			arr[i] = Integer.parseInt(br.readLine());

		}
		System.out.println("User Array : ");
		for(int i =0;i<arr.length;i++) {
		
			System.out.println(arr[i]);
		}
	}
}
