import java.util.Scanner;

class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int num = sc.nextInt();

         for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++)
                System.out.print("  ");
            int count = 2 * i - 1;
            for (int j = 1; j <= count; j++)
                System.out.print(i + " ");
            System.out.println();
        }

      
        for (int i = num - 1; i >= 1; i--) {
            for (int j = 1; j <= num - i; j++)
                System.out.print("  ");
            int count = 2 * i - 1;
        for (int j = 1; j <= count; j++)
                System.out.print(i + " ");
            System.out.println();
        }        sc.close();
    }
}

