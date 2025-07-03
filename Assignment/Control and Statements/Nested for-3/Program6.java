import java.util.*;

class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int num = sc.nextInt();

        for (int i = num; i >=1; i--) {
           

                for (int j = num; j>=1 ; j--) {
                    
		    int base = (i - 1)*num+j;
	            
	            
		    
		    	    
                    System.out.print(base + "\t ");

		   
                
            }
            System.out.println();
        }

        sc.close();
    }
}
// Positiin (a,b)=(a-1)*4+b
