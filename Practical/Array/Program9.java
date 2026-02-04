// Array
// Code - 9
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class ArrayDemo {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array Size : ");
		
                //int size = br.readLine(); // error: incompatible types: String cannot be converted to int
		int size;
		try{
		
			 size = Integer.parseInt(br.readLine());
		} catch(NumberFormatException e){
		
			size = 0;
			System.out.println("Invalid size");
		} catch(IOException e) {
		
			size = 0;
		}
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
