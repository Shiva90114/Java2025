import java.util.*;

class Sum {

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter  Number: ");
	int num = sc.nextInt();
          int sum=0;
       
	  for( int i = 0 ; i <=num ; i++){  
		 sum = sum+i;
	  }
	  System.out.println("Sum of "+num+" is "+sum);
	  sc.close();
       
	}

}
