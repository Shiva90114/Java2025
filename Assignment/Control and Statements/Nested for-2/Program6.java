import java.util.*;

class NumReverse {

	public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
           System.out.println("Number of Rows :");	  
	   int num = sc.nextInt();
	   
	   for(int i=num; i >=1; i--){
	    
		   for(int j=1; j <= num; j++){
		    

	             System.out.print((i+ (j - 1)*num)+" ");
		      
                   
                       


           }
	    System.out.println();
	   }
	   sc.close();
		
	}
}
