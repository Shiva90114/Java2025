import java.util.*;

class InvertedTriangle {

	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Number of Rows : ");
	int num = scanner.nextInt();
	for(int i = num; i>=1;i--){
	   for(int j = 1; j<=i;j++){
	   
		   System.out.print(i+" ");
	   }
	  System.out.println(); 
	}
	scanner.close();
	}
}
