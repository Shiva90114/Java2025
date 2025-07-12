import java.util.*;

class Increase8 {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int num = sc.nextInt();
       
        for (int i = 1; i <= num; i++) { 
            int Spaces = (i - 1) * 2;

            for (int s = 0; s < Spaces; s++) {
                System.out.print(" ");
            }

            
            for (int j = i; j <= num; j++) {
                System.out.print(j);
                if (j < num) { 
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
	sc.close();
    }
}
