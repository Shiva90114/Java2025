import java.util.*;

class NumCh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
          

                for (int j = 0; j < rows; j++) {
                    
		    int value = i + j*rows;	
                    System.out.print(value + "\t ");
	
		   
                
            }
            System.out.println();
        }

        sc.close();
    }
}
