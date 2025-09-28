// Search Element
import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
	int size = sc.nextInt();
	int arr[] = new int[size];
	System.out.println("Enter Element of Array : ");
         for(int i=0;i<arr.length;i++){
	 
		 arr[i] =sc.nextInt();
	 }
	System.out.println("Enter Element to Search :");
	int num =sc.nextInt();
	boolean flag = false;
        for(int i=0;i<size;i++){	
		if(num ==arr[i]){

        	flag= true;
		break;
		
		}
	}
	

	if(flag){
	System.out.println("Number is Present");
	}else{

		System.out.println("Number is not  Present");
	}
	}
	
}
