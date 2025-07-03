import java.util.*;

class StringDemo {

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String :");
	String name = sc.next();
 
	System.out.println("Enter Rows :");
        int rows = sc.nextInt();

	for(int i = 1;i<=rows;i++){
	   for(int j = 1;j<=rows;j++){

	            System.out.print(name+" ");   
	   }
	            System.out.println(" ");   

	} sc.close();
	
	}


}
