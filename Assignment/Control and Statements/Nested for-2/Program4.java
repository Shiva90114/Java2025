import java.util.*;

class Sequence {

	public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
           System.out.println("Number of Rows :");	  
	   int num = sc.nextInt();
	   
	   for(int i=0; i < num; i++){
	    int inum =( i + 1);
		   for(int j=0; j < num; j++){
		    

	             System.out.print(inum);
                   inum++;
                       


           }
	    System.out.println();
	   }
	   sc.close();
		
	}
}
