// Arrray  code  - 8

// Insert the value from  users and Print Frequency of digit

import java.util.*;
class ArrayExample{

	public static void main(String[] args){
	Scanner sc = new  Scanner(System.in);

		
	        System.out.println("Enter Size of Array : ");
		int num = sc.nextInt();
	        int[] arr = new int[num];
 
		System.out.println("Enter "+num+" Element for Array : ");
		for(int i=0;i<num;i++){

		       arr[i]=sc.nextInt();
		}
		int[] freq = new int[num];
		boolean[] visited = new boolean[num];
		for(int i =0;i<num;i++){
		
			if(visited[i])
				continue;
			int count = 1;
			for(int j = i+1;j<num;j++){
			
				if(arr[i] == arr[j]){
				
					count++;
					visited[j] = true;
				}
			}
			freq[i] = count;
		}
	
		
	for(int i =0;i<num;i++){
	
		if(!visited[i]){
		System.out.println("Element "+arr[i]+" is "+freq[i]+" Time");
		}
	}	
	}

}
