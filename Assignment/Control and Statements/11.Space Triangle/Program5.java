import java.util.*;

class Multiple5 {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int num = sc.nextInt();
        int max = num * num;
        
	int maxDigits = String.valueOf(max).length();

        for (int i = 1; i <= num; i++) {

            int current = (i * maxDigits) + (i - 1);
            
            int total = (num * maxDigits) + (num - 1);

        for (int j = 0; j < total - current; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
               int Print = i * k;
               String numStr = String.valueOf(Print);

              for (int l = 0; l < maxDigits - numStr.length(); l++) {
                    System.out.print(" ");
              }
              System.out.print(numStr);

             if (k < i) {
                 System.out.print(" ");
             }
             }
            System.out.println(); 
}
 }
}
