import java.util.*;

class NumCh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            if (i % 2 != 0) {
             
                for (int j = 1; j <= rows; j++) {
                    char ch = (char) ('A' + j - 1);
                    System.out.print(j + "" + ch + " ");
                }
            } else {
               
                for (int j = rows; j >= 1; j--) {
                    char ch = (char) ('A' + j - 1);
                    System.out.print(j + "" + ch + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
