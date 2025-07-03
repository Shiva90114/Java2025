import java.util.*;

class Square {

	public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
           System.out.println("Number of Rows :");	  
	   int num = sc.nextInt();
	   int base=1;
	   for(int i=1; i <= num; i++){
	    for(int j=1; j <= num; j++){
		    long square = (long)base*base;

	             System.out.print("  "+square);
                     base++;		    



           }
	    System.out.println();
	   }
	   sc.close();
		
	}
}
