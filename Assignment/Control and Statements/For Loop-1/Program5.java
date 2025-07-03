import java.util.*;

class Odd {

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter  Number: ");
	int num = sc.nextInt();
	System.out.println("Odd Number");
       
	  for( int i = 1 ; i <=num ; i++){  
		 if(i % 2 != 0) {
			 System.out.println(i);
		 	 if(i< num){
			   System.out.println(",");
			 } 
		  }
	  } sc.close();
       
	}

}
