import java.util.*;

class SqCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
           

                for (int j = 1; j <=num ; j++) {
                    
		    int base = (i - 1)*num+j;
	            long value;
	            if(base%2 !=0){
		      value = (long)Math.pow(base,3);
		    }else{
		      value = (long)Math.pow(base,2);
		    }
		    
		    	    
                    System.out.print(value + "\t ");

		   
                
            }
            System.out.println();
        }

        sc.close();
    }
}
// Positiin (a,b)=(a-1)*4+b= odd/even
