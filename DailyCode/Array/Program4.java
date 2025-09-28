import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
	int num = sc.nextInt();
	int arr[] = new int[num];
	System.out.println("Enter Element of Array : ");
         for(int i=0;i<arr.length;i++){
	 
		 arr[i] =sc.nextInt();
	 }
	System.out.println("Enter Array :");
        for(int i=0;i<arr.length;i++){	
        	System.out.println(arr[i]);
	}
	
	
	}
}
