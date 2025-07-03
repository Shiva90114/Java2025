import java.util.*;

class CenterTriangle {
 
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Rows Number :");
	int rows = scanner.nextInt();
        
	for(int i=rows;i>=1;i--){
	 int num = 1;
	    	for(int j=1;j<=i;j++){   
	       	     System.out.print(j+" ");
		 num++;
	     }
	
	System.out.println();
	}
	scanner.close();
	}






}
