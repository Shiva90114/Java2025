import java.util.*;

class Reverse {

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter  Number: ");
	int num = sc.nextInt();
	System.out.println("Reverse Number to 10  ");
       
	  for( int i = num ; i>=10 ; i--){  
		 
			 System.out.println(i);
		 	 if(i>10){
			   System.out.println(",");
			 } 
		  }
	   sc.close();
       
	}

}
