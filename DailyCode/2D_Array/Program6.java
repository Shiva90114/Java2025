// Program - 6
// 2D Array - Jagged Array
import java.util.*;
class ArrayDemo{

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        
	int  arr[][] =  new int[3][];
	arr[0] = new int[3];
	arr[1] = new int[2];
	arr[2] = new int[4];

	arr[0][0] = 1;
	arr[0][1] = 2;
	arr[0][2] = 3;
	
	arr[1][0] = 4;
	arr[1][1] = 5;
	

	arr[2][0] = 6;
	arr[2][1] = 7;
	arr[2][2] = 8;
	arr[2][3] = 9;


	System.out.println("Element of Array : ");
	
	for(int i =0;i<arr.length;i++){
	
		for(int j=0;j<arr[i].length;j++){
		      System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	   }
	}
}
