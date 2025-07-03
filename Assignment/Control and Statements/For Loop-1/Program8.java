import java.util.*;

class Table {

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter  Number: ");
	int num = sc.nextInt();
	System.out.println(num+" Table :");
       
	  for( int i = num ; i <=num ; i++){  
		 for(int j = 10; j>=1 ; j--) {
			 System.out.println(i*j);
		 
		  }
	  } sc.close();
       
	}

}
