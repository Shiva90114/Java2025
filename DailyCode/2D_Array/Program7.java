//2D Array 
//Program 7
//BufferedReader

import java.io.*;
class ArrayDemo{

	public static void main(String[] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Enter Number of Rows : ");
	int rows =  Integer.parseInt(br.readLine());
	System.out.println("Enter Number of Coloumns : ");                                                                                                          int cols =  Integer.parseInt(br.readLine());

	int arr[][] = new int[rows][cols];
	System.out.println("Enter Array Data : ");
	for(int i =0;i<rows;i++){
	
		for(int j=0;j<cols;j++){
		arr[i][j] = Integer.parseInt(br.readLine());
		}
	}
	System.out.println("Array Data");
	for(int i=0;i<rows;i++){
	
		for(int j=0;j<cols;j++){
			 System.out.print(arr[i][j]+" ");

		
		}
		System.out.println();
	}
	
	}
}
