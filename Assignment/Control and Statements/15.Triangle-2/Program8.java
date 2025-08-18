import java.util.Scanner;

class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
        
        for (int i = 1; i <= num; i++) {
            
            System.out.print(i);
            
            
            char ch = (char) ('A' + (i - 2));
            if (i >= 2) {
                System.out.print(" " + ch);
            }
            
            
            int num1 = i - 2;
            while (num1 >= 1) {
                ch = (char) ('A' + (num1 - 2));
                System.out.print(" " + num1);
                if (num1 >= 2) {
                    System.out.print(" " + ch);
                }
                num1 -= 2;
            }
            System.out.println();
        }
        sc.close();
    }
}
