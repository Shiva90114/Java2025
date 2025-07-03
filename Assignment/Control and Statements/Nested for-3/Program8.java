import java.util.*;

class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int num = sc.nextInt();

        for (int i =1; i <=num; i++) {
            if(i%2!=0){
                      char StarCh = (char)('A'+(num -1));

		      for (int j = 0; j<num ; j++) {
                     System.out.print((char)(StarCh-j));
		}   } else {
	      	  for (int j = 1; j<=num ; j++) {
                     System.out.print(j+"");
		
		
		}
		    
	            
	            
		    
		    	    
                   

	     }	   
         System.out.println();       
            }
            sc.close();
        }

        
    }


