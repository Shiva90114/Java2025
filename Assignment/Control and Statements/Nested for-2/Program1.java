import java.util.*;

class Rows {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int n = sc.nextInt(); 

        printRepeatingStartPattern(n);

        sc.close();
    }

    public static void printRepeatingStartPattern(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive number of rows.");
            return;
        }

        int currentNumber = 1; 
        int lastNumberInPreviousRow = 0; 

        for (int i = 0; i < n; i++) { 
            if (i == 0) {
               
            } else {
               
                currentNumber = lastNumberInPreviousRow;
            }

            for (int j = 0; j < n; j++) { 
                System.out.printf("%-4d", currentNumber); 
                lastNumberInPreviousRow = currentNumber; 
                currentNumber++; 
            }
            System.out.println();
        }
    }
}
