import java.util.*;

class Totalodd {

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter  Number: ");
	int num = sc.nextInt();
          int count =0;
       
	  for( int i = 1 ; i <=num ; i++){  
		 if(i%2!=0) {
		 count++;
		 }
	  }
	  System.out.println("Numberof odd is "+count);
	  sc.close();
       
	}

}
