import java.util.*;

class Rows {

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Number of Rows :");
	int num = sc.nextInt();
        int rows=1;
	for(int i = 1;i<=num;i++){
	   for(int j = 1;j<=num;j++){

	            System.out.print(rows+" ");
		    rows++;    
	   }
	            System.out.println(" ");   

	} sc.close();
	
	}


}
