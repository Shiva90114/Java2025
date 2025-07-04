import java.util.Scanner;

class MultiplesPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        printMultiplesPattern(numRows);
        scanner.close();
    }

    public static void printMultiplesPattern(int numRows) {
        // Calculate the maximum number in the pattern (last number in the last row)
        int maxNum = numRows * numRows;
        // Determine the number of digits in the maximum number to use for padding
        int maxDigits = String.valueOf(maxNum).length();

        for (int i = 1; i <= numRows; i++) { // Outer loop for rows (i represents the current row number)

            // Calculate the width of the current row based on its numbers and required padding
            // Each number needs 'maxDigits' space, plus one space between numbers
            // e.g., for numRows=4, maxDigits=2 (for 16)
            // Row 1 (1): width needed (1 number * 2 digits) + (0 spaces) = 2
            // Row 2 (2 4): width needed (2 numbers * 2 digits) + (1 space) = 5
            // Row 3 (3 6 9): width needed (3 numbers * 2 digits) + (2 spaces) = 8
            // Row 4 (4 8 12 16): width needed (4 numbers * 2 digits) + (3 spaces) = 11

            int currentRowPrintedWidth = (i * maxDigits) + (i - 1);
            
            // Calculate the total width the last row would occupy if all numbers were maxDigits wide
            // (numRows numbers * maxDigits) + (numRows - 1 spaces between numbers)
            int totalPatternWidth = (numRows * maxDigits) + (numRows - 1);

            // Print leading spaces for right alignment
            for (int j = 0; j < totalPatternWidth - currentRowPrintedWidth; j++) {
                System.out.print(" ");
            }

            // Print numbers for the current row
            for (int k = 1; k <= i; k++) {
                int numberToPrint = i * k;
                String numStr = String.valueOf(numberToPrint);

                // Pad current number with leading spaces to match maxDigits
                for (int l = 0; l < maxDigits - numStr.length(); l++) {
                    System.out.print(" ");
                }
                System.out.print(numStr);

                // Print a space between numbers in the same row
                if (k < i) {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
