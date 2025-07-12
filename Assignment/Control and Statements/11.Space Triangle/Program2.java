import java.util.*;

class Decrease {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int num = sc.nextInt();
        
        int max = (num * 2) - 1;

        for (int i = 1; i <= num; i++) {
         
            int row = i;
          
            int width = (row * 2) - 1;

         
            for (int j = 0; j < max - width; j++) {
                System.out.print(" ");
            }

       
            
            for (int k = num; k >= (num - i + 1); k--) {
                System.out.print(k);
                if (k > (num - i + 1)) { 
                    System.out.print(" ");
            }
            }
            System.out.println();
    }
    }
}
