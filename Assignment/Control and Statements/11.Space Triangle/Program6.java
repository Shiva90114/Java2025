import java.util.*;

class Decrease6 {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int num = sc.nextInt();
        
        int max = (num * 2) - 1;

        for (int i = num; i >= 1; i--) {
            int Row = i;
            
            int Width = (Row * 2) - 1; 
 
           
            for (int s = 0; s < max - Width; s++) {
                System.out.print(" ");
            }
 
         
            for (int j = 1; j <= i; j++) {
              System.out.print(i);
              if (j < i) { 
                 System.out.print(" ");
           }
           }
     System.out.println(); 
    }
    }
}

