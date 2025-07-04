import java.util.*;

class RightAlignedDecreasingPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        printRightAlignedDecreasingPattern(numRows);
        scanner.close();
    }

    public static void printRightAlignedDecreasingPattern(int numRows) {
       
        //  formula: (numRows * 2) - 1
        int maxWidth = (numRows * 2) - 1;

        for (int i = 1; i <= numRows; i++) {
         
            int currentRowElements = i;
          
            int currentWidth = (currentRowElements * 2) - 1;

         
            for (int j = 0; j < maxWidth - currentWidth; j++) {
                System.out.print(" ");
            }

       
            //  loop from numRows down to (numRows - i + 1).
            for (int k = numRows; k >= (numRows - i + 1); k--) {
                System.out.print(k);
                if (k > (numRows - i + 1)) { 
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
