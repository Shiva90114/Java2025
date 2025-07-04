import java.util.*;

class DecreasingPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        printRightAlignedDecreasingRepeatingPattern(numRows);
        scanner.close();
    }

    public static void printRightAlignedDecreasingRepeatingPattern(int numRows) {
     
        int maxWidth = (numRows * 2) - 1;

        for (int i = numRows; i >= 1; i--) {
            int currentRowElements = i;
            
            int currentWidth = (currentRowElements * 2) - 1; // (number of digits * 1) + (number of spaces * 1)

           
            for (int s = 0; s < maxWidth - currentWidth; s++) {
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
