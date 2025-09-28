import java.io.*;

class ArrayDemo{

	public static void main(String[] args){
	int arr[] = new int[4];
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;
	arr[3]=40;
         for(int i=0;i<arr.length;i++){
	 
		 System.out.println(arr[i]);
	 }
	System.out.println(arr); // Address of aary Print
	System.out.println(arr[0]);
	System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);	

	
	}
}
