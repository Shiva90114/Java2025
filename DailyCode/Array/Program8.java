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
        for(int i=0;i<size;i++){	
		if(num ==arr[i]){

        	System.out.println(arr[i]);
		break;
		}else{
		System.out.println("Not Present");
		}
	}

	
	
	}
}
