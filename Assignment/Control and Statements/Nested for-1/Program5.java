import java.util.*;

class Rows {

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Number of Rows :");
	int rows = sc.nextInt();
        int num =1;
	for(int i = 1;i<=rows;i++){
	   for(int j = 1;j<=rows;j++){

	            System.out.print(num+" ");
		        
	   }
	   num++;         
	   System.out.println(" ");   

	} sc.close();
	
	}


}
