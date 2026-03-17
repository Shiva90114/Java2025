// Code - 2
// 2D Array

import java.io.*;

class DemoArray {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("2D Array ");
		System.out.println("Enter rows and Columns : ");
		int rows = Integer.parseInt(br.readLine());
		int cols = Integer.parseInt(br.readLine());
		
		int arr[][] = new int[rows][cols];
		System.out.println("Enter Data : ");

		for(int i =0;i<rows;i++){

                         for(int j =0;j<cols;j++){
                                    arr[i][j] = Integer.parseInt(br.readLine());

                     }
                }
		System.out.println("Array Data ");
		for(int i =0;i<rows;i++){
		
			 for(int j =0;j<cols;j++){
			 System.out.println(arr[i][j]+" ");
		
		     }
		}
	
	}
}

