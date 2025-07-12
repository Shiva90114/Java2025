import java.util.*;

class Number {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  number of rows: ");
        int num = sc.nextInt();
        
        for (int i = 1; i <= num; i++) {
            int Width = (num * 2) - 1;
            int current = (i * 2) - 1;

            for (int j = 0; j < Width - current; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k);
                if (k < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
