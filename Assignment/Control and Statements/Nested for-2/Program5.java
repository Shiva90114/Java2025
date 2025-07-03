import java.util.*;

class NumChar {

	public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
           System.out.println("Number of Rows :");	  
	   int num = sc.nextInt();
	   
	   char ch =(char)('A' +(num -1)); 
	   int num1 = 1;
	   for(int i=0; i < num; i++){
	    
		   for(int j=0; j < num; j++){
		    

	             System.out.print(ch+""+num1+" ");
		      
                   num1++;
                       


           }
	    System.out.println();
	   }
	   sc.close();
		
	}
}
