import java.util.*;

class Reverse {

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Number of Rows :");
	int rows = sc.nextInt();
        int num =1;
	for(int j =1; j<=rows;j++){
	for(int i =rows;i>=1;i--){
	   

	            System.out.print(i+" ");
	            	        
	}
	System.out.println();
	}
	            
	    sc.close();
	
	}


}
