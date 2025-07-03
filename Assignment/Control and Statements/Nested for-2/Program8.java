import java.util.Scanner;

class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int odd = 1;   
        int even = 2;  

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (j % 2 != 0) {
                    System.out.print((odd * odd) + " ");
                    odd += 2;
                } else {
                    System.out.print(even + " ");
                    even += 2;
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
