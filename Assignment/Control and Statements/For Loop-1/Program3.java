import java.util.*;

class Digit {

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Number to Start 3 digit Number: ");
	int num = sc.nextInt();
        int i = 100;
	  for( i = 100 ; i < 100 + num ; i++){  
	    	  System.out.println(i);
		 	   if(i < 99 + num){
		                 System.out.print(",");
	                   }

	  }
       
	}

}
