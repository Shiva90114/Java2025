import java.util.*;

class EvenOdd {

	public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
           System.out.println("Number of Rows :");	  
	   int num = sc.nextInt();
	   
	   for(int i=1; i<=num; i++){
	    
		   for(int j=1; j <= num; j++){
		    // the value : (currnt row no) +2*(current column no-1)

	             System.out.print((i+2*(j - 1) )+" ");
		      
                   
                       


           }
	    System.out.println();
	   }
	   sc.close();
		
	}
}
