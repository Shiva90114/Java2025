import java.util.*;

class Pattern7 {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
     
        System.out.print("Enter Number of rows: ");
        int rows = sc.nextInt();

     
        for (int i = 0; i < rows; i++) {
           for (int s = 0; s < i; s++) {
              System.out.print(" ");
            }
           for (int j = 1; j <= rows - i; j++) {
                System.out.print(j);
            }
	    System.out.println();
            }
	sc.close();
       }
}
